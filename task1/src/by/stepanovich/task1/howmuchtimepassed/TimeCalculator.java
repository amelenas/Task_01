package by.stepanovich.task1.howmuchtimepassed;

import java.util.Scanner;

public class TimeCalculator {
    private int seconds;

    public static void main(String[] args) {
        TimeCalculator timeCalculator = new TimeCalculator();
        System.out.println(timeCalculator.hoursLeft() + " hours "
                        + timeCalculator.minutesLeft() + " minutes "
                        + timeCalculator.secondsLeft() + " seconds have passed");
    }

    public TimeCalculator() {
        this.seconds = secondsReader();
    }


    public int hoursLeft() {
        return seconds / 3600;
    }

    public int minutesLeft() {
        return (seconds % 3600 / 60);
    }

    public int secondsLeft() {
        return seconds % 60;
    }

    private int secondsReader() {
        int result;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the seconds: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid number format.");
                scanner.nextLine();
            }
            result = scanner.nextInt();
            if (result >= 86400) {
                System.out.println("This is more than one day: ");
            }
        } while (result >= 86400 || result < 0);
        return result;
    }
}
