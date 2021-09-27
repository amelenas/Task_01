package by.stepanovich.task1.whichpointiscloser;

import java.util.Scanner;

public class CloserPoint {
    private double[] points;
    public static void main(String[] args) {
        CloserPoint closerPoint = new CloserPoint();
        closerPoint.showCloserPoint();
    }
    public CloserPoint() {
        this.points = pointsReader();
    }

    public void showCloserPoint() {
        double A = Math.pow(points[0], 2) + Math.pow(points[1], 2);
        double B = Math.pow(points[2], 2) + Math.pow(points[3], 2);

        if (A < B) {
            System.out.println("Point A is closer");
        }
        if (A > B) {
            System.out.println("Point B is closer");
        }
        if (A == B) {
            System.out.println("The points are equal");
        }
    }

    private double[] pointsReader() {
        double[] result = new double[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    System.out.println("Enter x1 of point A ");
                    break;
                case 1:
                    System.out.println("Enter y1 of point A ");
                    break;
                case 2:
                    System.out.println("Enter x2 of point B ");
                    break;
                case 3:
                    System.out.println("Enter y2 of point B ");
                    break;
            }
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid number format.");
                scanner.nextLine();
            }
            result[i] = scanner.nextDouble();
        }
        return result;
    }

}
