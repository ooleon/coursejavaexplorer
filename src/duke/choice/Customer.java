package duke.choice;

import java.util.ArrayList;
import java.util.Collection;
import duke.choice.Clothing;

public class Customer {

    private String name;
    private String size;
    private String country = "Br";
    private String address = "r n 123, Oak St";
    private String city = "CA";
    private Clothing[] items;

    public double getTotalClothingCost() {
        double total;
        //total = (item1.price * (1 + tax) * cantidadItem1) + (item2.price * (1 + tax) * cantidadItem2);
        total = 0;
        for (Clothing item : this.items) {
            total = total + item.getPrice();
            if (total >= 50) {
                break;
            }
        }
            System.out.println("\tTotal:\t\t" + total);
        return total;
    }

    public void listItems() {
        for (Clothing item : this.items) {
            System.out.println("\t" + item.getDescription() + ", " + item.getPrice() + ", " + item.getPriceNeto() + ", " + item.getSize());
        }
    }

    public Clothing[] getItems() {
        return items;
    }

    public void addMoreItems(Clothing[] newItems) {
        ArrayList<Clothing> al = new ArrayList();
        if (this.items != null) {
            for (Clothing i : this.items) {
                al.add(i);
            }
        }

        if (newItems != null) {
            for (Clothing i : newItems) {
                al.add(i);
            }
        }
        this.items = al.toArray(newItems);

    }

    public void addItems(Clothing[] items) {
        this.items = items;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurement) {
        switch (measurement) {
            case 1:
            case 2:
            case 3:
                this.setSize("S");
                break;

//            case 4: case 5: case 6:
/*  Exception in thread "main" java.lang.RuntimeException: 
        Uncompilable code - multiple case labels are not supported in -source 8
        (use -source 14 or higher to enable multiple case labels)
             */
            case 4, 5, 6:   // source 14 or higher
                this.setSize("M");
                break;
            case 7, 8, 9:
                this.setSize("L");
                break;
            default:
                this.setSize("X");
                break;
        }

    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

}
