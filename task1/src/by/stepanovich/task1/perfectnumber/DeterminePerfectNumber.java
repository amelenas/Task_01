package by.stepanovich.task1.perfectnumber;

import java.util.Scanner;


public class DeterminePerfectNumber {
    private int number;

    public static void main(String[] args) {
        DeterminePerfectNumber determinePerfectNumber = new DeterminePerfectNumber();
        System.out.println(determinePerfectNumber.isPerfectNumber());
    }

    public DeterminePerfectNumber() {
        this.number = numberReader();
    }

    public boolean isPerfectNumber() {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        return sum == number;
    }

    private int numberReader() {
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid number format.");
            scanner.nextLine();
        }
        result = scanner.nextInt();

        return result;
    }

}
