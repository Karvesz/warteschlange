
public class Knoten
{
    // instance variables - replace the example below with your own
    private Knoten nachfolger;
    private Datenelement daten;

    /**
     * Constructor for objects of class Knoten
     */
    public Knoten(Datenelement d)
    {
        nachfolger=null;
        daten=d;
    }

    public Knoten getNachfolger(){
        return nachfolger;
    }

    public void setNachfolger(Knoten k){
        nachfolger =k;
    }

    public Datenelement getDatenelement(){
        return daten;
    }
    public int getAlter(){
        return daten.getAlter();

    }

    public int getAlterNachMir(){

        if(nachfolger != null) {
            return (nachfolger.getAlterNachMir() + daten.getAlter());

        }
        else{
            return daten.getAlter();

        }
    }
    int restlaengegeben()

    {
        if(nachfolger != null) {
            return (nachfolger.restlaengegeben() +1);
        }
        else{
            return 1;
        }
    }
}

