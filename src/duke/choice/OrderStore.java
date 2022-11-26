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
    double price = 0.0;

    public static void main(String[] args) {
        OrderStore os = new OrderStore();
        System.out.println("Welcome to Duke OrderStore!");
        Customer c1 = new Customer();
        c1.setName("Pinky");
        c1.setSize("S");
        c1.setSize(6);
        System.out.println("Customer: " + c1.getName() + ", " + c1.getSize() + ", ");

        System.out.println("Clothing: ");

        item1 = new Clothing();
        item2 = new Clothing();
        item3 = new Clothing();
        item4 = new Clothing();
        Clothing[] items1 = {item1};
        Clothing[] items2 = {item2};
        Clothing[] items = {item3, item4};
//        Clothing[] items = {item1, item2, item3, item4};

        item1.setDescription("Blue Jacket");
        item1.setPrice(10.9);
        item1.setSize("M");

        item2.setDescription("Orange T-Shirt");
        item2.setPrice(11.5);
        item2.setSize("S");

        item3.setDescription("Blue T-Shirt");
        item3.setPrice(12.5);
        item3.setSize("S");

        item4.setDescription("Green Jacket");
        item4.setPrice(14.5);
        item4.setSize("M");


        int cantidadItem1 = 1;
        int cantidadItem2 = 2;
        
        c1.addItems(items);
        System.out.println (c1.getItems().length);
        c1.listItems();
        System.out.println ();
        c1.getTotalClothingCost();

        
    }
}
