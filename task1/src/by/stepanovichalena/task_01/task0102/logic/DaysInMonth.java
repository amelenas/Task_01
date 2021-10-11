package by.stepanovichalena.task_01.task0102.logic;

import by.stepanovichalena.task_01.exception.Task01Exception;

public class DaysInMonth {
    private static final int DIVIDE_INTO_400 = 400;
    private static final int DIVIDE_INTO_100 = 100;
    private static final int DIVIDE_INTO_4 = 4;

    public int daysInMonth(int month, boolean isLeapYear) throws Task01Exception {
        int[] daysInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month <= 0 || month > 12) {
            throw new Task01Exception("The month values should be in the range from 1 to 12.");
        }
        if (month == 2 && isLeapYear)
            return 29;
        return daysInMonth[month - 1];
    }

    public boolean isLeapYear(int year) {
        return ((year % DIVIDE_INTO_400 == 0) ||
                (year % DIVIDE_INTO_4 == 0 && year % DIVIDE_INTO_100 != 0));
    }
}
