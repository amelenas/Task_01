package by.stepanovich.task1.circlesize;

import java.util.Scanner;

public class CircleArea {
    private double radius;


    public static void main(String[] args) {
        CircleArea circleArea = new CircleArea();
        System.out.println("The area of the circle is: " + circleArea.areaOfCircle());
        System.out.println("Circumference is: " + circleArea.circumferenceCounter());
    }

    public CircleArea() {
        this.radius = radiusReader();
    }

    public double areaOfCircle() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double circumferenceCounter() {
        return 2 * Math.PI * radius;
    }


    private double radiusReader() {
        double result;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the radius: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid number format.");
                scanner.nextLine();
            }
            result = scanner.nextDouble();
            if (result <= 0) {
                System.out.println("Please enter a number greater than 0: ");
            }
        } while (result <= 0);
        return result;
    }
}
