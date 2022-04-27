package shop;

import shop.staff.Boss;
import shop.staff.Worker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop {
    List<Shell>shells = new ArrayList<>();
    Map<Integer, Product> productMap= new HashMap<>();
//    List<Product>products = new ArrayList<>();


    public Shop() {
        shells.add(new Shell(1,10));
        shells.add(new Shell(2,4));
        shells.add(new Shell(3,6));
    }
}
