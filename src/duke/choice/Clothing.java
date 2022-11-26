package duke.choice;

/**
 *
 * @author leo
 */
public class Clothing {

    private final double MINIMUM_PRICE = 10.0;
    private final double TAX = 0.2;

    private String description;
    private double price;
    private String size = "M";

    private static double tmp_price;

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
