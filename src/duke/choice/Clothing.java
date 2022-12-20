package duke.choice;

/**
 *
 * @author leo
 */
public class Clothing implements Comparable<Clothing>{

    public final static double MINIMUM_PRICE = 10.0;
    public final static double TAX = 0.2;

    public String description;
    private double price;
    private String size = "M";

    private static double tmp_price;

    @Override
    public int compareTo(Clothing c) {
//        return this.description.compareTo(c.description);
//          return this.size.compareTo(c.size);
          return Double.compare(this.price, c.price) * -1;
      }

    

    @Override
    public String toString() {
        return this.description +", "+ this.size +", Precio: "+ this.price +", Neto: "+ this.getPriceNeto();
    }
    
    public double getPriceNeto() {
        return this.price;
    }

    public double getPrice() {
        return this.price + (this.price * TAX);
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        //        if (price < MINIMUM_PRICE) {
        //            this.price = MINIMUM_PRICE;
        //        } else {
        //            this.price = price;
        //        }
        this.price =  price < MINIMUM_PRICE ? MINIMUM_PRICE : price;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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

}
