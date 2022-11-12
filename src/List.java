
public class List {
    private Knoten startElement;

    public List() {
        startElement = null;

    }

    void standardListFunction(){
        if(startElement ==null){
            // was machst du wenn die Liste leer ist
        }
        else {
            startElement.standardKnotenFunction();
        }
    }

    public void removeLastElement() {
        if (startElement == null) {
            System.out.println("Liste leer");
        }
        else {
            startElement = startElement.removeLastElement();
        }
    }

    void getLengthOfList() {
        int laenge = 0;
        if (startElement != null) {
            laenge = startElement.getRemainingLengthOfList();
            System.out.println("Länge:" + laenge);
        }
        else {
            System.out.println("Liste Leer");

        }
    }

    void prepend(Knoten k) {
        if (startElement != null) {
            k.setNextElement(startElement);
        }
        startElement = k;
    }

    void removeFirstElement() {
        if (startElement == null) {
            System.out.println("Liste leer");
        }
        else {
            startElement = startElement.getNextElement();
        }
    }

    void removeElementAtIndex(int index) {

        if (startElement ==null) {
            System.out.println("Index nicht vorhanden");
        }
        else {
            if(index==0) {
                startElement = startElement.getNextElement();
            }
            else {
                startElement.removeElementAtIndex(index, 0);
            }
        }

    }

    void printTotalAge() {
        int a;
        if (startElement != null) {
            a = startElement.getAgeOfNextElement();
            System.out.println("Alter:" + a);
        }
        else {
            System.out.println("0");
        }

    }

    void append(Knoten k) {


        if (startElement == null) {
            // Liste ist leer, einfach als erstes Element einfügen
            startElement = k;
        }
        else {
            startElement.hinteneinfuegen(k);

        }
    }

    void printInfo() {

        if(startElement == null) {
            System.out.println("Liste leer");
        }
        else {
            startElement.printInfo();
        }

    }
}









