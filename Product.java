import java.time.LocalDate;

/**
 * Product
 */
public class Product {

    protected String name;
    protected double price;
    protected LocalDate releasDate;

    public Product(String name, double price, LocalDate releasDate) {
        this.name = name;
        this.price = price;
        this.releasDate = releasDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getReleasDate() {
        return releasDate;
    }

    @Override
    public String toString() {
        return "Product{" +
               "name='" + name + '\'' +
               ", price=" + price +
                ", releasDate=" + releasDate +
               '}';
    }
}