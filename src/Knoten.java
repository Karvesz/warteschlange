
public class Knoten {
    private Knoten nachfolger;
    private Datenelement daten;


    public Knoten(Datenelement d) {
        nachfolger = null;
        daten = d;
    }

    public Knoten getNachfolger() {
        return nachfolger;
    }

    public void setNachfolger(Knoten k) {
        nachfolger = k;
    }

    public void hinteneinfuegen(Knoten k) {

        if (nachfolger != null) {
            nachfolger.hinteneinfuegen(k);
        }
        else {
            setNachfolger(k);
        }

    }

    public Datenelement getDatenelement() {
        return daten;
    }

    public int getAlter() {
        return daten.getAlter();

    }

    public int getAlterNachMir() {

        if (nachfolger != null) {
            return (nachfolger.getAlterNachMir() + daten.getAlter());

        }
        else {
            return daten.getAlter();

        }
    }

    int restlaengegeben() {
        if (nachfolger != null) {
            return (nachfolger.restlaengegeben() + 1);
        }
        else {
            return 1;
        }
    }

    public void printInfo() {
        System.out.println("Hallo ich bin " + daten.getName());
        System.out.println("Ich bin " + daten.getAlter() + "\n");
        if (nachfolger != null) {
            nachfolger.printInfo();
        }
    }

    public void standardKnotenFunction() {
        // wenn jedes Element das machen soll: aufgabe der funktion ausführen

        if (nachfolger == null) {
            // wenn nur das letzte Element was machen soll: dann hier ausführen
            //wenn return value -> hier return
            //wenn void -> nichts tun
        }
        else {
            // wenn return dann auch da return
            nachfolger.standardKnotenFunction();
        }
    }

    public void removeElementAtIndex(int index, int currentIndex) {

        if (currentIndex + 1 == index && getNachfolger() != null) {
            setNachfolger(getNachfolger().getNachfolger());
        }
        else if (nachfolger == null) {
            System.out.println("Index nicht vorhanden");
        }
        else {
            nachfolger.removeElementAtIndex(index, currentIndex + 1);
        }
    }

}


