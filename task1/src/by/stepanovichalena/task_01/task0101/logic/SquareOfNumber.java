package by.stepanovichalena.task_01.task0101.logic;

public class SquareOfNumber {
    public int squareCalculator(int number) {
        int lastNumber = number % 10;
        return (int) Math.pow(lastNumber, 2);
    }
}
