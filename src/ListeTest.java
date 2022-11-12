import org.junit.jupiter.api.Test;

class ListeTest {

    @Test
    void createListWithTenElements(){
        List l1 = new List();
        for (int i = 0; i < 10; i++) {
            Datenelement d1 = new Datenelement("Peter", i);
            Knoten k1 = new Knoten(d1);
            l1.append(k1);
        }

    }


}