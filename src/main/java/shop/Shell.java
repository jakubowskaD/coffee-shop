package shop;

import java.util.ArrayList;
import java.util.List;

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

    public int getMaxProductsNumber() {
        return maxProductsNumber;
    }
    public boolean isFreePlace(int shellNumber){
        return products.size() < maxProductsNumber;
    }
}
