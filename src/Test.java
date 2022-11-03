
public class Test
{


    private Warteschlange w;
    private String p1;
    private String p2;
    private String p3;
    private String p4;

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        w=new Warteschlange();
        p1= "p1";
        p2 = "p2";
        p3 = "p3";
        p4 = "p4";

    }


    void test(){
        w.infosAusgeben();
        System.out.println("Einfügen p1:");
        w.einfuegen(p1);
        w.infosAusgeben();
        System.out.println("Einfügen p2,3,4:");
        w.einfuegen(p2);
        w.einfuegen(p3);
        w.einfuegen(p4);
        w.infosAusgeben();
        System.out.println("Entfernen:");
        w.entfernen();
        w.infosAusgeben();
        System.out.println("Entfernen öfter als Elemente in Liste:");
        w.entfernen();
        w.entfernen();
        w.entfernen();
        w.entfernen();
        w.entfernen();
        w.entfernen();
        w.infosAusgeben();
    }

}
