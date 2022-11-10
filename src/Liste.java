
public class Liste
{
    private Knoten anfang;

    public Liste()
    {
        anfang = null;

    }
    void laengeGeben(){
        int laenge = 0;
        if(anfang != null)
        {
            laenge = anfang.restlaengegeben();
            System.out.println("Länge:" + laenge);
        }
        else{
            System.out.println("Liste Leer");

        }
    }

    void einfuegen(Knoten k){
        if(anfang == null)  {
            anfang = k;

        }
        else{
            k.setNachfolger(anfang);
            anfang = k;

        }
    }
    void entfernen(){
        if(anfang == null){
            System.out.println("Liste leer");
        }
        else{
            anfang = anfang.getNachfolger();
        }
    }
    void SummeAlter(){
        int a;
        if(anfang!= null){
            a= anfang.getAlterNachMir();
            System.out.println("Alter:" +a);
        }
        else{
            System.out.println("0");
        }

    }
    void hinteneinfuegen(Knoten k){
        Knoten a = anfang;

        if(a == null){
            anfang = k;
        }

        else{
            if(a.getNachfolger() == null){
                a.setNachfolger(k);
            }
            else{
                a = a.getNachfolger();
                hinteneinfuegen(k);
            }
        }
    }
}









