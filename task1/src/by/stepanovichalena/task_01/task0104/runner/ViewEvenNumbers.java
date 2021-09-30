package by.stepanovichalena.task_01.task0104.runner;

import by.stepanovichalena.task_01.task0104.entity.NumbersABCD;
import by.stepanovichalena.task_01.task0104.logic.IsTwoEvenNumbers;
import by.stepanovichalena.task_01.reader.ConsoleReader;

public class ViewEvenNumbers {

    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();
        IsTwoEvenNumbers isTwoEvenNumbers = new IsTwoEvenNumbers();
        NumbersABCD a = new NumbersABCD();
        NumbersABCD b = new NumbersABCD();
        NumbersABCD c = new NumbersABCD();
        NumbersABCD d = new NumbersABCD();
        a.setPointABCD(consoleReader.readInt());
        b.setPointABCD(consoleReader.readInt());
        c.setPointABCD(consoleReader.readInt());
        d.setPointABCD(consoleReader.readInt());

        System.out.println(isTwoEvenNumbers.isTwoEvenNumbers(a.getPointABCD(), b.getPointABCD(), c.getPointABCD(), d.getPointABCD()));
        }


}
