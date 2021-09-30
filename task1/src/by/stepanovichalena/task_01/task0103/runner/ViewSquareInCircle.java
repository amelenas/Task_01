package by.stepanovichalena.task_01.task0103.runner;

import by.stepanovichalena.task_01.task0103.logic.InscribedSquare;
import by.stepanovichalena.task_01.task0103.logic.TimesInSquareCounter;
import by.stepanovichalena.task_01.exception.Task01Exception;
import by.stepanovichalena.task_01.reader.ConsoleReader;

public class ViewSquareInCircle {

    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();
        double areaOfBigSquare = consoleReader.readDouble();

        InscribedSquare inscribedSquare = new InscribedSquare();
        TimesInSquareCounter timesInSquareCounter = new TimesInSquareCounter();
        try {
            System.out.println("The area of the inscribed square is: " + inscribedSquare.areaOfInscribedSquare(areaOfBigSquare));
            System.out.println("The area of the inscribed square is: " + timesInSquareCounter.timesInSquareCounter(areaOfBigSquare) + " times smaller");
        } catch (Task01Exception e) {
            e.printStackTrace();
        }
    }
}
