package staff;

import shop.Product;
import shop.Shell;
import shop.Shop;

import java.util.concurrent.ThreadLocalRandom;

public class Boss implements Staff{
    TypeOfStaff typeOfStaff = TypeOfStaff.Boss;
    Shop shop;

    public Boss(TypeOfStaff typeOfStaff) {
        this.typeOfStaff = typeOfStaff;
    }

    @Override
    public void orderToTakeOn(Staff staff, Shell shell, Product product) {
        if (!staff.equals(TypeOfStaff.Boss)){
            int shellNumber = ThreadLocalRandom.current().nextInt(1, shop.shells.size()+1);
            shop.shellMap.put(shellNumber, product);
            System.out.println(staff + " put " + product.getName() + "to shell number: " + shellNumber);
        }
    }

    @Override
    public void orderToTakeOff(Staff staff, Shell shell, Product product) {
        if (!staff.equals(TypeOfStaff.Boss)){
            int shellNumber = ThreadLocalRandom.current().nextInt(1, shop.shells.size()+1);
            shop.shellMap.remove(shellNumber, product);
            System.out.println(staff + " takeOff " + product.getName() + "to shell number: " + shellNumber);
        }
    }

    @Override
    public void takeOn(Shell shell, Product product, String day) {

    }

    @Override
    public void takeOff(Shell shell, Product product, String day) {

    }

}
