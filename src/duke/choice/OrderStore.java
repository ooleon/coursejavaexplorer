package duke.choice;

import duke.choice.Clothing;
import java.util.ArrayList;
import java.util.List;

import duke.choice.Customer;
import duke.choice.Kikito;

public class OrderStore {

    static Clothing item1;
    static Clothing item2;
    static Clothing item3;
    static Clothing item4;
    static int measurement = 3;

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

        item3 = new Clothing();
        item3.description = "Blue T-Shirt";
        item3.price = 10.5;
        item3.size = "S";

        item4 = new Clothing();
        item4.description = "Green Jacket";
        item4.price = 20.5;
        item4.size = "M";

        Clothing[] items = {item1, item2, item3, item4};
        System.out.println("descriptorString: " + items.getClass().descriptorString());
        System.out.println("CanonicalName: " + items.getClass().getCanonicalName());
        System.out.println("Name: " + items.getClass().getName());
        System.out.println("PackageName: " + items.getClass().getPackageName());
        System.out.println("SimpleName: " + items.getClass().getSimpleName());
        System.out.println("TypeName: " + items.getClass().getTypeName());
        System.out.println("toGenericString: " + items.getClass().toGenericString());
        
        Customer c1 = new Customer();
        c1.name = "Pinky";
        c1.size = "S";
        System.out.println("Customer: " + c1.name);
        System.out.println("Customer: ");

        switch (measurement) {
            case 1: case 2: case 3:
                c1.size = "S";
                break;

//            case 4: case 5: case 6:
/*  Exception in thread "main" java.lang.RuntimeException: 
        Uncompilable code - multiple case labels are not supported in -source 8
        (use -source 14 or higher to enable multiple case labels)
*/
            case 4, 5, 6:   // source 14 or higher
                c1.size = "M";
                break;
            case 7, 8, 9:
                c1.size = "L";
                break;
            default:
                c1.size = "X";
                break;
        }
        int cantidadItem1 = 1;
        int cantidadItem2 = 2;
        //total = (item1.price * (1 + tax) * cantidadItem1) + (item2.price * (1 + tax) * cantidadItem2);
        total = 0;
        
        for (Clothing item: items){
            total = total + item.price * (1 + tax);
            System.out.println("\t" + item.description + "," + item.price + "," + item.size);
            System.out.println("\tTotal:\t\t" + total );
            if (total >= 50) {break;}
        }
        
        //imprimirTotal_v1(total);
    }

    private static double calcularTotal_v1(double dtotal) {
        double rTotal = 0;
//        rTotal = (item1.price * (1 + tax) * cantidadItem1) + (item2.price * (1 + tax) * cantidadItem2);
        return rTotal;
    }
    
    private static void imprimirTotal_v1(double dtotal) {
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
