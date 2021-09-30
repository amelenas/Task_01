package by.stepanovichalena.task_01.task0109.runner;

import by.stepanovichalena.task_01.task0109.logic.AreaOfCircle;
import by.stepanovichalena.task_01.task0109.logic.CircumferenceCounter;
import by.stepanovichalena.task_01.exception.Task01Exception;
import by.stepanovichalena.task_01.reader.ConsoleReader;

public class CircleSizeView {

    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();
        System.out.println("Enter the radius");
        double radius = consoleReader.readDouble();
        AreaOfCircle areaOfCircle = new AreaOfCircle();
        CircumferenceCounter circumferenceCounter = new CircumferenceCounter();

        try {
            System.out.println("The area of the circle is: " + areaOfCircle.areaOfCircle(radius));
            System.out.println("Circumference is: " + circumferenceCounter.circumferenceCounter(radius));
        } catch (Task01Exception ex) {
            ex.printStackTrace();
        }
    }
}

