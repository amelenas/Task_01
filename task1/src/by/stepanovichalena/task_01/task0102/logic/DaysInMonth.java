package by.stepanovichalena.task_01.task0102.logic;

import by.stepanovichalena.task_01.exception.Task01Exception;

public class DaysInMonth {
    public int daysInMonth(int month, boolean isLeapYear) throws Task01Exception {
        int[] daysInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month <= 0 || month > 12) {
            throw new Task01Exception("The month values should be in the range from 1 to 12.");
        }
        if (month == 2 && isLeapYear)
            return 29;
        return daysInMonth[month - 1];
    }
}
