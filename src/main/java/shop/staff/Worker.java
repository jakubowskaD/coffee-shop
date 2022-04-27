package shop.staff;

import shop.Product;
import shop.Shell;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    List<String> workingOffDays = new ArrayList<>();
    Shell shell;


    public Worker() {
    }

    public boolean isWorkingOffDay(String day){
        return workingOffDays.contains(day);
    }
    public void takeOn(String day, Product product, Shell shell){
        if(!isWorkingOffDay(day)){
            if (shell.isFreePlace(shell.getShellNumber())){
          shell.products.add(new Product(product.getName()));
          System.out.println("Aj!");
        } else System.out.println("Sorry Boss, today is my free day");
    }

    public void takeOff(String day, Product product, Shell shell){
            if(!isWorkingOffDay(day)){
                if (shell.isFreePlace(shell.getShellNumber())){
                    shell.products.remove(new Product(product.getName()));
                    System.out.println("Aj!");
                } else System.out.println("Sorry Boss, today is my free day");
            }
    }

}
