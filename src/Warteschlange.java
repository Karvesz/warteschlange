public class Warteschlange
{
    Patient anfang;
    Patient ende;
    Patient newPatient;






    public Warteschlange()
    {
        anfang = null;
        ende = null;
    }

    public void einfuegen (String name) {
        Patient newPatient = new Patient(name);


        if(anfang == null) {
            anfang = newPatient;
            ende = newPatient;
        }
        else {
            ende.nachfolgerSetzen(newPatient);
            ende = newPatient;
        }
    }

    public void entfernen() {
        if(anfang == null) {
            System.out.println("Keine Patienten mehr");

        }
        else {

            anfang = anfang.nachfolgerGeben();
        }


    }



    public void infosAusgeben() {

        if(anfang != null) {
            anfang.infoAusgeben();
        }

        else {
            System.out.println("keine Infos");
        }

    }
}
