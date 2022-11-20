package duke.choice;

import duke.choice.Clothing;
import java.util.ArrayList;
import java.util.List;

import duke.choice.Customer;
import duke.choice.Kikito;

public class OrderStore {

    static Clothing item1;
    static Clothing item2;

    private static void listaKikito() {
        List l = new ArrayList<String>();
        l.add("client");
        l.add("1");
        System.out.println("Lista: " + l.get(0));
        Kikito k = new Kikito();
    }

    public static void main(String[] args) {
        double tax = 0.2, total;
        System.out.println("Welcome to Duke OrderStore!");

        item1 = new Clothing();
        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";

        item2 = new Clothing();
        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";

        int cantidadItem1 = 1;
        int cantidadItem2 = 2;
        total = (item1.price * (1 + tax) * cantidadItem1) + (item2.price * (1 + tax) * cantidadItem2);

        imprimitTotal(total);

        Store s = new Store();
        s.status();

        Customer c1 = new Customer();
        c1.name = "Cliente";
        System.out.println("Customer: " + c1.name);
        System.out.println("Customer: ");

        listaKikito();
    }

    private static void imprimitTotal(double dtotal) {
        System.out.println(item1.description + "," + item1.price + "," + item1.size);
        System.out.println(item2.description + "," + item2.price + "," + item2.size);

        System.out.println("Total: " + dtotal);

    }

}

class Store {

    String _store;
    String store;
    String vacio, vaciote;

    void status() {
        vacio = "";
        System.out.println("_store: " + _store);
        System.out.println("vacio no es nulo {-" + vacio + "-" + vaciote + "}");
    }
}
