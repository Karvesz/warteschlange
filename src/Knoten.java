
public class Knoten {
    private Knoten nextElement;
    private Datenelement person;


    public Knoten(Datenelement person) {
        nextElement = null;
        this.person = person;
    }

    public Knoten getNextElement() {
        return nextElement;
    }

    public void setNextElement(Knoten k) {
        nextElement = k;
    }

    public void hinteneinfuegen(Knoten k) {

        if (nextElement != null) {
            nextElement.hinteneinfuegen(k);
        }
        else {
            setNextElement(k);
        }

    }

    public Datenelement getDatenelement() {
        return person;
    }

    public int getAge() {
        return person.getAge();

    }

    public int getAgeOfNextElement() {

        if (nextElement != null) {
            return (nextElement.getAgeOfNextElement() + person.getAge());

        }
        else {
            return person.getAge();

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
        System.out.println("Hallo ich bin " + person.getName());
        System.out.println("Ich bin " + person.getAge() + "\n");
        if (nextElement != null) {
            nextElement.printInfo();
        }
    }

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
}


