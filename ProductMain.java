import java.time.LocalDate;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Родник", 100, LocalDate.of(2024, 1, 1));
        Product bottle2 = new BottleOfWater("Красный ключ", 200, LocalDate.of(2024, 1, 1), 0.5F,
                EPackage.GLASS.getMaterial(), true);

        Product hotDrink1 = new HotDrink("Кофе", 100, LocalDate.of(2024, 1, 1));
        Product hotDrink2 = new HotDrink("Чай", 100, LocalDate.of(2024, 1, 1), 100, 0.2F);

        VendingMachine vm = new VendingMachine();

        vm.initProducts(List.of(bottle1, bottle1, bottle1, bottle1, bottle2, bottle2, bottle2, bottle2));

        System.out.println(vm.getProducts());

        vm.getProduct("Красный ключ");

        System.out.println(vm.getProducts());

        HotDrinkVendingMashine hvm = new HotDrinkVendingMashine();

        hvm.initProducts(List.of(hotDrink1, hotDrink1, hotDrink1, hotDrink2, hotDrink2, hotDrink2));

        System.out.println(hvm.getProducts());

        hvm.getProduct("Кофе");

        System.out.println(hvm.getProducts());
    }
}
