package TaskThird;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Морковь", 25.50, ProductCategory.VEGETABLES));
        products.add(new Product("Лук", 17.99, ProductCategory.VEGETABLES));
        products.add(new Product("Картофель", 50, ProductCategory.VEGETABLES));
        products.add(new Product("Огурцы", 90.49, ProductCategory.VEGETABLES));
        products.add(new Product("Шоколад", 220, ProductCategory.SWEETS));
        products.add(new Product("Печенье", 64.59, ProductCategory.SWEETS));
        products.add(new Product("Зефир", 110.50, ProductCategory.SWEETS));
        products.add(new Product("Карамель", 130, ProductCategory.SWEETS));
        products.add(new Product("Морс", 90.29, ProductCategory.DRINKS));
        products.add(new Product("Сок апельсиновый", 90.99, ProductCategory.DRINKS));
        products.add(new Product("Сок томатный", 89.95, ProductCategory.DRINKS));
        products.add(new Product("Минеральная воды", 50.50, ProductCategory.DRINKS));


        
    }
}
