import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    protected List<Product> products;

    public VendingMachine() {
        this.products = new ArrayList<>();
    }
    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void initProducts(List<Product> products) {
        this.products.addAll(products);
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
                return product;
            }
        }
        throw new RuntimeException("Нет такоого продукта" + name);
    }
}
