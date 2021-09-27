package by.stepanovich.task1.valueoffunction;

import java.util.Scanner;

public class CalculateValueOfFunction {
    private double number;
    private boolean isNumberGreaterThanTree;

    public static void main(String[] args) {
        CalculateValueOfFunction calculateValueOfFunction = new CalculateValueOfFunction();
        System.out.println(calculateValueOfFunction.calculateFunction());
    }

    public CalculateValueOfFunction() {
        this.number = numberReader();
        this.isNumberGreaterThanTree = isNumberGreaterThanThree();
    }
    public double calculateFunction() {
        double result;
        if (isNumberGreaterThanTree) {
            result = Math.pow(-number, 2) + 3 * number + 9;
        } else {
            result = 1 / (Math.pow(number, 3) - 6);
        }
        return result;
    }

    private boolean isNumberGreaterThanThree() {
        return number >= 3;
    }

    private double numberReader() {
        double result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid number format.");
            scanner.nextLine();
        }
        result = scanner.nextDouble();

        return result;
    }
}
