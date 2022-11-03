
public class Patient
{
    String name;
    public Patient nachfolger;

    public Patient(String n)
    {

        name = n;
        nachfolger = null;

    }

    public void nachfolgerSetzen(Patient newPatient) {
        nachfolger = newPatient;
    }

    Patient nachfolgerGeben() {
        return nachfolger;
    }

    public void infoAusgeben() {
        System.out.println(name);
        System.out.println(nachfolger);
    }


}
