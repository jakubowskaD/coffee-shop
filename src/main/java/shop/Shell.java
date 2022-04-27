package shop;

import java.util.ArrayList;
import java.util.List;

public class Shell {
    public List<Product> products = new ArrayList<>();
    Product product;
    private int maxNumberOfProducts;
    private int number;

    public Shell(int maxNumberOfProducts) {
        this.maxNumberOfProducts = maxNumberOfProducts;
    }

    public Shell(int number,Product product) {
        this.number = number;
        this.product = product;
    }

    public int getNumber() {
        return number;
    }

    public int getMaxNumberOfProducts() {
        return maxNumberOfProducts;
    }
}
