package by.stepanovichalena.task_01.task0102.runner;

import by.stepanovichalena.task_01.task0102.logic.DaysInMonth;
import by.stepanovichalena.task_01.task0102.logic.IsLeapYear;
import by.stepanovichalena.task_01.exception.Task01Exception;
import by.stepanovichalena.task_01.reader.ConsoleReader;

public class ViewDaysInMonth {
    public static void main(String[] args) {
        ConsoleReader reader = new ConsoleReader();
        System.out.println("Enter a month: ");
        int month = reader.readInt();
        System.out.println("Enter a year: ");
        int year = reader.readInt();
        IsLeapYear isLeapYear = new IsLeapYear();
        DaysInMonth daysInMonth = new DaysInMonth();
        try {
            System.out.println(daysInMonth.daysInMonth(month, isLeapYear.isLeapYear(year)) + " days in this month");
        } catch (Task01Exception e) {
            e.printStackTrace();
        }
    }
}
