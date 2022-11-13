public class List {
    private Knoten startElement;

    public List() {
        startElement = null;
    }

   /*
   void standardListFunction() {
        if (startElement == null) {
            // was machst du wenn die Liste leer ist
        }
        else {
            startElement.standardKnotenFunction();
        }
    }
    */

    public void removeLastElement() {

        if (isStartElementPrintIfEmpty()) {
            startElement = startElement.removeLastElement();
        }
    }

    void removeElementAtIndex(int index) {

        if (isStartElementPrintIfEmpty()) {
            if (index == 0) {
                startElement = startElement.getNextElement();
            }
            else {
                startElement.removeElementAtIndex(index, 0);
            }
        }
    }

    void insertElementAtIndex(int index, Knoten knoten) {
        if (isStartElementPrintIfEmpty()) {
            startElement = startElement.insertElementAtIndex(index, 0, knoten);
        }
        else {
            if(index == 0){
                startElement = knoten;
            }
        }
    }

    void removeFirstElement() {

        if (isStartElementPrintIfEmpty()) {
            startElement = startElement.getNextElement();
        }
    }

    void prepend(Knoten k) {
        if (isStartElementPrintIfEmpty()) {
            k.setNextElement(startElement);
        }
        startElement = k;
    }

    void append(Knoten k) {

        if (isStartElementPrintIfEmpty()) {
            startElement.append(k);
        }
        else {
            startElement = k;
        }
    }

    void getLengthOfList() {
        int laenge = 0;
        if (isStartElementPrintIfEmpty()) {
            laenge = startElement.getRemainingLengthOfList();
            System.out.println("Länge:" + laenge);
        }
    }

    void printTotalAge() {
        int a;
        if (isStartElementPrintIfEmpty()) {
            a = startElement.getAgeOfNextElement();
            System.out.println("Alter:" + a);
        }
    }

    void printInfo() {
        if (isStartElementPrintIfEmpty()) {
            startElement.printInfo();
        }
    }

    public boolean isStartElementPrintIfEmpty() {
        if (startElement == null) {
            System.out.println("Liste leer");
        }
        return startElement != null;
    }
}