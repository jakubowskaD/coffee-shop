package staff;

import shop.Product;
import shop.Shell;
import shop.Shop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Worker implements Staff{

    TypeOfStaff typeOfStaff = TypeOfStaff.Worker;
    Map<Integer, Boolean> workingDay = new HashMap<>();
    String dayOff1;
    String dayOff2;
    Shop shop;

    public Worker(TypeOfStaff typeOfStaff,String dayOff1, String dayOff2) {
        this.typeOfStaff = typeOfStaff;
        this.dayOff1 = dayOff1;
        this.dayOff2 = dayOff2;
    }

    public Worker(TypeOfStaff typeOfStaff) {
        this.typeOfStaff = typeOfStaff;

    }

    public TypeOfStaff getTypeOfStaff() {
        return typeOfStaff;
    }

    @Override
    public void orderToTakeOn(Staff staff, Shell shell, Product product) {
    }

    @Override
    public void orderToTakeOff(Staff staff, Shell shell, Product product) {

    }

    @Override
    public void takeOn(Shell shell, Product product, String day) {
        if(!Objects.equals(day, dayOff1) || !Objects.equals(day, dayOff2)){
            System.out.println("Aj Boss!");
            shop.shellMap.put(shell.getNumber(), product);
        }else System.out.println("Sorry Boss! It's my day off");
    }

    @Override
    public void takeOff(Shell shell, Product product, String day) {
        if(!Objects.equals(day, dayOff1) || !Objects.equals(day, dayOff2)){
            System.out.println("Aj Boss!");
            shop.shellMap.remove(shell.getNumber(), product);
        }else System.out.println("Sorry Boss! It's my day off");
    }
}
