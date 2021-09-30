package by.stepanovichalena.task_01.task0102.logic;


public class IsLeapYear {
    public boolean isLeapYear(int year) {
        return (year > 1584 && ((year % 400 == 0) ||
                (year % 4 == 0 && year % 100 != 0)));
    }
}
