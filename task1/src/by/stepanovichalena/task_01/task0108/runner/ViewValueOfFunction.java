package by.stepanovichalena.task_01.task0108.runner;

import by.stepanovichalena.task_01.reader.ConsoleReader;
import by.stepanovichalena.task_01.task0108.logic.CalculateValueOfFunction;

public class ViewValueOfFunction {
    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();
        CalculateValueOfFunction calculateValueOfFunction = new CalculateValueOfFunction();
        double number = consoleReader.readDouble();

        System.out.println("The value of the function is: " + calculateValueOfFunction.calculateFunction(number));

    }
}
