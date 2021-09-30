package by.stepanovichalena.task_01.task0101.runner;

import by.stepanovichalena.task_01.reader.ConsoleReader;
import by.stepanovichalena.task_01.task0101.logic.SquareOfNumber;

public class SquareOfNumberRunner {
    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();
        int number = consoleReader.readInt();
        SquareOfNumber squareOfNumber = new SquareOfNumber();
        System.out.println(squareOfNumber.squareCalculator(number));
    }
}
