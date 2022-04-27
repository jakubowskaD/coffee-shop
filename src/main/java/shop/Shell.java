package shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shell {
    private final int shellNumber;
    private final int maxProductsNumber;
    public List<Product>products = new ArrayList<>();

    public Shell(int shellNumber, int maxProductsNumber) {
        this.shellNumber = shellNumber;
        this.maxProductsNumber = maxProductsNumber;
    }

    public int getShellNumber() {
        return shellNumber;
    }

    public boolean isFreePlace(int shellNumber){
        return products.size() < maxProductsNumber;
    }

    @Override
    public String toString() {
        return "Shell{" +
                "shellNumber=" + shellNumber +
                ", maxProductsNumber=" + maxProductsNumber +
                ", products=" + products +
                '}';
    }
}
