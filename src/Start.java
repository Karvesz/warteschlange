import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Start {

    public static Liste L1;

    public static void main (String[] args) {


        Liste L1 = new Liste();
        insert();


    }

    public static void insert () {

        System.out.println("Hallo :)");
        System.out.println("Watchu wanna do?");
        System.out.println("Press 1 to enter a new element");
        System.out.println("Press 2 to change the age of an element");
        System.out.println("Press 3 to change the age of an element");
        System.out.println("Press 4 if u're fine and wanna get sum info");

        Scanner sc1 = new Scanner(System.in);
        int i = sc1.nextInt();

        //new element
        if(i == 1) {

            System.out.println("Enter name");
            Scanner sc2 = new Scanner(System.in);
            String name = sc2.nextLine();
            System.out.println("Name: "+name);


            System.out.println("Enter age");
            int age = sc1.nextInt();
            System.out.println("Age: "+age);

            //insert data
            Datenelement d1 = new Datenelement(name, age);
            Knoten k1 = new Knoten(d1);
            L1.einfuegen(k1);

            System.out.println("Successfully added <3");

            insert();

            //change age
            if(i == 1) {

            }

            //change name
            if(i == 1) {

            }

            //see info
            if(i == 1) {
                L1.SummeAlter();

            }








        }


    }



}
