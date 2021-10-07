package by.stepanovichalena.task_01.task0104.runner;

import by.stepanovichalena.task_01.task0104.entity.NumberForTask;
import by.stepanovichalena.task_01.task0104.logic.IsTwoEvenNumbers;
import by.stepanovichalena.task_01.reader.ConsoleReader;

public class ViewEvenNumbers {

    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();
        IsTwoEvenNumbers isTwoEvenNumbers = new IsTwoEvenNumbers();
        int[] numbers = new int[4];
        for (int i = 0; i < 4; i++) {
            numbers[i] = consoleReader.readInt();
        }
        System.out.println(isTwoEvenNumbers.isTwoEvenNumbersOrMore(numbers));
    }
}
