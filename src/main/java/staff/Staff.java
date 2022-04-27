package staff;

import shop.Product;
import shop.Shell;

public interface Staff {

    public void orderToTakeOn(Staff staff, Shell shell, Product product);
    public void orderToTakeOff(Staff staff,Shell shell, Product product);
    public void takeOn(Shell shell, Product product, String day);
    public void takeOff(Shell shell, Product product, String day);

}
