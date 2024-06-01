import java.util.List;

public class HotDrinkVendingMashine extends VendingMachine {

    public HotDrinkVendingMashine() {
        super();
    }

    public HotDrinkVendingMashine(List<Product> products) {
        super(products);
    }

    public HotDrink getProduct(String name, double volume, int temperature) {
        for (Product product : getProducts()) {
            if (product.getName().equals(name) && product instanceof HotDrink) {
                HotDrink hotDrink = (HotDrink) product;
                if (hotDrink.getVolume() == volume && hotDrink.getTemperature() == temperature) {
                    getProducts().remove(product);
                    return hotDrink;
                }
            }
        }
        throw new RuntimeException("Нет такого горячего напитка с указанными параметрами: " + name + ", объем: " + volume + ", температура: " + temperature);
    }
}
