package by.stepanovich.task1.daysinmonthquantifier;

import java.util.Scanner;

public class DaysInMonthCounter {
    private Scanner scanner = new Scanner(System.in);
    private int year;
    private int month;
    private boolean isLeapYear;

    public static void main(String[] args) {
        DaysInMonthCounter daysInMonthCounter = new DaysInMonthCounter();
        System.out.println(daysInMonthCounter.daysInMonth() +" days in this month");
    }

    public DaysInMonthCounter() {
        this.year = yearReader();
        this.month = monthReader();
        this.isLeapYear = isLeapYear();
    }

    public int daysInMonth() {
        int[] daysInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2 && isLeapYear)
            return 29;

        return daysInMonth[month - 1];
    }

    private boolean isLeapYear() {
        return (year > 1584 && ((year % 400 == 0) ||
                (year % 4 == 0 && year % 100 != 0)));

    }

    private int monthReader() {
        int inputtedNumber;
        do {
            System.out.println("Enter a month: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid number format.");
                scanner.nextLine();
            }
            inputtedNumber = scanner.nextInt();
            if (inputtedNumber > 12 || inputtedNumber <= 0) {
                System.out.println("Please enter a number from 1 to 12: ");
            }
        } while (inputtedNumber > 12 || inputtedNumber <= 0);
        return inputtedNumber;
    }

    private int yearReader() {
        int inputtedNumber;
        do {
            System.out.println("Enter a year: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid number format.");
                scanner.nextLine();
            }
            inputtedNumber = scanner.nextInt();
            if (inputtedNumber < 0) {
                System.out.println("Invalid number format. Please enter a number greater than 0: ");
            }
        } while (inputtedNumber < 0);
        return inputtedNumber;
    }
}

