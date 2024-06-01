import java.time.LocalDate;

/**
 * BottleOfWater
 */
public class BottleOfWater extends Product {

    private float volume;
    private String pack;
    private boolean isSpark;

    public BottleOfWater(String name, double price, LocalDate releasDate) {
        super(name, price, releasDate);
        this.volume = 1;
        this.pack = EPackage.PLASTIC.getMaterial();
        this.isSpark = false;
    }

    public BottleOfWater(String name, double price, LocalDate releasDate, float volume, String pack, boolean isSpark) {
        super(name, price, releasDate);
        this.volume = volume;
        this.pack = pack;
        this.isSpark = isSpark;
    }

    public float getVolume() {
        return volume;
    }

    public String getPack() {
        return pack;
    }

    public boolean isSpark() {
        return isSpark;
    }

    @Override
    public String toString() {
        return "Product{" +
        "name='" + name + '\'' +
        ", price=" + price + '\'' +
         ", releasDate=" + releasDate + '\'' +
            "volume='" + volume + '\'' +
            ", pack=" + pack + '\'' +
            ", isSpark=" + isSpark + '\'' +
        '}';
    }
}