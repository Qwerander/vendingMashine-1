import java.time.LocalDate;

/**
 * HotDrink
 */
public class HotDrink extends Product {

    private int temperature;
    private float volume;

    public HotDrink(String name, double price, LocalDate releasDate) {
        super(name, price, releasDate);
        this.temperature = 100;
        this.volume = 1F;
    }

    public HotDrink(String name, double price, LocalDate releasDate, int temperature, float volume) {
        super(name, price, releasDate);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public float getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Product{" +
        "name='" + name + '\'' +
        ", price=" + price + '\'' +
         ", releasDate=" + releasDate + '\'' +
            "temperature='" + temperature +
        '}';
    }

}