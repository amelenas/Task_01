package by.stepanovich.task1.ariaofsquareincircle;

import by.stepanovich.task1.isexisttwoevennumbers.DetermineEvenNumbers;

import java.util.Scanner;

public class SquareInACircle {
    private double areaOfBigSquare;
    private double areaOfASmallSquare;

    public static void main(String[] args) {
        SquareInACircle squareInACircle = new SquareInACircle();
        System.out.println("The area of the inscribed square is: " + squareInACircle.areaOfASmallSquare());
        System.out.println("The circumference of the inscribed square is " + squareInACircle.timesInSquareCounter() + " times smaller");

    }

    public SquareInACircle() {
        this.areaOfBigSquare = squareReader();
        this.areaOfASmallSquare = areaOfASmallSquare();
    }

    public int timesInSquareCounter() {
        return (int) Math.round(areaOfBigSquare / areaOfASmallSquare);
    }

    public double areaOfASmallSquare() {
        return areaOfBigSquare / 2;
    }

    private double squareReader() {
        double result;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter a number: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid number format.");
                scanner.nextLine();
            }
            result = scanner.nextDouble();
            if (result <= 0){
                System.out.println("Please enter a number greater than 0: ");
            }
        } while (result <= 0);
        return result;
    }
}
