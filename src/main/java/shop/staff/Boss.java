package shop.staff;

import shop.Product;
import shop.Shell;


public class Boss {


    public Boss() {
    }

    public void orderTakeOn(Worker worker, String day, Product product, Shell shell){
        System.out.println(worker.getName() + " put " + product.getName() + " to shell " + shell.getShellNumber());
        worker.takeOn(day, product, shell);
    }
    public void orderTakeOff(Worker worker, String day, Product product, Shell shell){
        System.out.println(worker.getName() + " takeOff " + product.getName() + " from shell " + shell.getShellNumber());
        worker.takeOff(day, product, shell);
    }
}
