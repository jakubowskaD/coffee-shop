package shop;

import java.util.ArrayList;
import java.util.List;

public class Shell {
    public List<Product> products = new ArrayList<>();
    Product product;
    private final int maxNumberOfProducts;

    public Shell(int maxNumberOfProducts) {
        this.maxNumberOfProducts = maxNumberOfProducts;
    }

    public Shell(Product product) {
        this.product = product;
    }

    public int getMaxNumberOfProducts() {
        return maxNumberOfProducts;
    }
}
