package shop.staff;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    List<String> workingOffDays = new ArrayList<>();

    public Worker() {
    }

    public boolean isWorkingOffDay(String day){
        return workingOffDays.contains(day);
    }
    public void takeOn(){

    }
    public void takeOff(){

    }

}
