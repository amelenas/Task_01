package by.stepanovich.task1.squareoflastdigit;

import java.util.Scanner;

public class SquareOfNumber {
    private int number;

    public static void main(String[] args) {
        SquareOfNumber squareOfNumber = new SquareOfNumber();
        System.out.println(squareOfNumber.squareCalculator());
    }

    public SquareOfNumber() {
        this.number = numberReader();
    }

    public int squareCalculator() {
        int lastNumber = number % 10;
        return lastNumber * lastNumber;
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
