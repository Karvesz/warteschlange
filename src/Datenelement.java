public class Datenelement
{
    private String name;
    private int Alter;

    public Datenelement(String n, int a)
    {
        name=n;
        Alter = a;

    }
    public String getName(){
        return name;
    }

    public void setName(String n){
        name=n;
    }
    public void setAlter(int a){
        Alter = a;
    }
    public int getAlter(){
        return Alter;

    }
    public void infoAusgeben(){
        System.out.println( "Name: "+name);
        System.out.println("Alter:" +Alter);

    }
}