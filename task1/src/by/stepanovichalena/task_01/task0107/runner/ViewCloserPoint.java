package by.stepanovichalena.task_01.task0107.runner;

import by.stepanovichalena.task_01.reader.ConsoleReader;

import by.stepanovichalena.task_01.task0107.entity.Points;
import by.stepanovichalena.task_01.task0107.logic.CloserPoint;

public class ViewCloserPoint {

    public static void main(String[] args) {
        int result;
        ConsoleReader consoleReader = new ConsoleReader();
        CloserPoint closerPoint = new CloserPoint();
        Points pointA = new Points();
        Points pointB = new Points();
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    System.out.println("Enter x1 of point A: ");
                    pointA.setX(consoleReader.readDouble());
                    break;
                case 1:
                    System.out.println("Enter y1 of point A: ");
                    pointA.setY(consoleReader.readDouble());
                    break;
                case 2:
                    System.out.println("Enter x2 of point B: ");
                    pointB.setX(consoleReader.readDouble());
                    break;
                case 3:
                    System.out.println("Enter y2 of point B: ");
                    pointB.setY(consoleReader.readDouble());
                    break;
            }
        }
        result = closerPoint.showCloserPoint(pointA.getX(), pointA.getY(), pointB.getX(), pointB.getY());
        switch (result) {
            case 1:
                System.out.println("Point A is closer.");
                break;
            case -1:
                System.out.println("Point B is closer.");
                break;
            case 0:
                System.out.println("The points are equal");
        }
    }
}
