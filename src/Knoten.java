
public class Knoten {
    private Knoten nextElement;
    private Datenelement person;

    public Knoten(Datenelement person) {
        nextElement = null;
        this.person = person;
    }

    /*
    public void standardKnotenFunction() {
        // wenn jedes Element das machen soll: aufgabe der funktion ausführen

        if (nextElement == null) {
            // wenn nur das letzte Element was machen soll: dann hier ausführen
            //wenn return value -> hier return
            //wenn void -> nichts tun
        }
        else {
            // wenn return dann auch da return
            nextElement.standardKnotenFunction();
        }
    }
    */

    public void append(Knoten k) {

        if (nextElement != null) {
            nextElement.append(k);
        }
        else {
            setNextElement(k);
        }
    }

    public void removeElementAtIndex(int index, int currentIndex) {

        if (currentIndex + 1 == index && getNextElement() != null) {
            setNextElement(getNextElement().getNextElement());
        }
        else if (nextElement == null) {
            System.out.println("Index nicht vorhanden");
        }
        else {
            nextElement.removeElementAtIndex(index, currentIndex + 1);
        }
    }

    public Knoten removeLastElement() {
        if (nextElement == null) {
            return null;
        }
        else {
            nextElement = nextElement.removeLastElement();
            return this;
        }
    }

    int getRemainingLengthOfList() {
        if (nextElement != null) {
            return (nextElement.getRemainingLengthOfList() + 1);
        }
        else {
            return 1;
        }
    }

    public void printInfo() {
        person.printNameAndAge();
        if (nextElement != null) {
            nextElement.printInfo();
        }
    }

    public int getAge() {
        return person.getAge();
    }

    public String getName() { return person.getName(); }

    public int getAgeOfNextElement() {

        if (nextElement != null) {
            return (nextElement.getAgeOfNextElement() + person.getAge());
        }
        else {
            return person.getAge();
        }
    }

    public Knoten getNextElement() {
        return nextElement;
    }

    public void setNextElement(Knoten k) {
        nextElement = k;
    }

    public Datenelement getPerson() {
        return person;
    }

    public Knoten insertElementAtIndex(int index, int currentIndex, Knoten newKnoten) {
        if (currentIndex == index) {
            newKnoten.setNextElement(this);
            return newKnoten;
        }
        else {
            if (nextElement == null) {
                System.out.println("Index zuuu hoch");
            }
            else {
                nextElement = nextElement.insertElementAtIndex(index, currentIndex + 1, newKnoten);
            }
            return this;
        }
    }


}
