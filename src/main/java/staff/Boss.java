package staff;

import shop.Product;
import shop.Shell;

public class Boss implements Staff{
    @Override
    public void orderToTakeOn(Staff staff, Shell shell, Product product) {

    }

    @Override
    public void orderToTakeOff(Staff staff, Shell shell, Product product) {

    }

    @Override
    public void takeOn(Shell shell, Product product) {

    }

    @Override
    public void takeOff(Shell shell, Product product) {

    }

    @Override
    public boolean isWorkingDay(Weekday weekday) {
        return false;
    }
}
