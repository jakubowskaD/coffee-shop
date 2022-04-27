package shop;

import shop.staff.Boss;
import shop.staff.Worker;

import java.util.ArrayList;
import java.util.List;


public class Shop {
    List<Shell> shells = new ArrayList<>();
    Boss boss = new Boss();
    Worker worker = new Worker("Bob");


    public Shop() {
        shells.add(new Shell(1,10));
        shells.add(new Shell(2,4));
        shells.add(new Shell(3,6));
        worker.workingOffDays.add("Sunday");
    }

    public void run(){
        int shelfNum = 0;
        Shell shell1 = shells.stream()
                .filter(shell -> shell.getShellNumber() == shelfNum)
                .findFirst().get();
        boss.orderTakeOn(worker,"Monday",new Product("tomato"),shells.get(shelfNum));
        boss.orderTakeOff(worker, "Sunday", new Product("tomato"), shells.get(shelfNum));
        boss.orderTakeOff(worker, "Monday", new Product("tomato"),shells.get(shelfNum));
    }
}
