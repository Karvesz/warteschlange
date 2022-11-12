
public class Liste {
    private Knoten anfang;

    public Liste() {
        anfang = null;

    }

    void standardListFunction(){
        if(anfang==null){
            // was machst du wenn die Liste leer ist
        }
        else {
            anfang.standardKnotenFunction();
        }
    }

    void laengeGeben() {
        int laenge = 0;
        if (anfang != null) {
            laenge = anfang.restlaengegeben();
            System.out.println("Länge:" + laenge);
        }
        else {
            System.out.println("Liste Leer");

        }
    }

    void prepend(Knoten k) {
        if (anfang != null) {
            k.setNachfolger(anfang);
        }
        anfang = k;
    }

    void removeFirstElement() {
        if (anfang == null) {
            System.out.println("Liste leer");
        }
        else {
            anfang = anfang.getNachfolger();
        }
    }

    void removeElementAtIndex(int index) {

        if (anfang==null) {
            System.out.println("Index nicht vorhanden");
        }
        else {
            anfang.removeElementAtIndex(index, 0);
        }

    }

    void SummeAlter() {
        int a;
        if (anfang != null) {
            a = anfang.getAlterNachMir();
            System.out.println("Alter:" + a);
        }
        else {
            System.out.println("0");
        }

    }

    void append(Knoten k) {


        if (anfang == null) {
            // Liste ist leer, einfach als erstes Element einfügen
            anfang = k;
        }
        else {
            anfang.hinteneinfuegen(k);

        }
    }

    void printInfo() {

        if(anfang == null) {
            System.out.println("Liste leer");
        }
        else {
            anfang.printInfo();
        }

    }
}









