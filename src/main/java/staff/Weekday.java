package staff;

public enum Weekday {
    Monday(true),
    Tuesday(true),
    Wednesday(true),
    Thursday(true),
    Friday(true),
    Saturday(false),
    Sunday(false);

    boolean workingDay;

    private Weekday(boolean isWorkingDay){
        workingDay = isWorkingDay;
    }
}
