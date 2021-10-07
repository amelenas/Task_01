package by.stepanovichalena.task_01.task0102.logic;


public class IsLeapYear {
    private static final int DIVIDE_INTO_400 = 400;
    private static final int DIVIDE_INTO_100 = 100;
    private static final int DIVIDE_INTO_4 = 4;

    public boolean isLeapYear(int year) {
        return ((year % DIVIDE_INTO_400 == 0) ||
                (year % DIVIDE_INTO_4 == 0 && year % DIVIDE_INTO_100 != 0));
    }
}
