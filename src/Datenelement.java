public class Datenelement {
    private String name;
    private int age;

    public Datenelement(String n, int a) {
        name = n;
        age = a;

    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;

    }

    public void printNameAndAge() {
        System.out.println("Name: " + name);
        System.out.println("Alter:" + age);

    }
}