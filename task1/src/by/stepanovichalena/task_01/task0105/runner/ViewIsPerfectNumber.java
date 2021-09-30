package by.stepanovichalena.task_01.task0105.runner;

import by.stepanovichalena.task_01.reader.ConsoleReader;
import by.stepanovichalena.task_01.task0105.logic.IsPerfectNumber;

public class ViewIsPerfectNumber {
    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();
        IsPerfectNumber isPerfectNumber = new IsPerfectNumber();
        System.out.println(isPerfectNumber.isPerfectNumber(consoleReader.readInt()));
    }

}
