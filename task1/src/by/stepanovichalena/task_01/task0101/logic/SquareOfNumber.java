package by.stepanovichalena.task_01.task0101.logic;

public class SquareOfNumber {
    private static final int FOR_REMAINDER_OF_NUMBER = 10;

    public int squareCalculator(int number) {
        int lastNumber = number % FOR_REMAINDER_OF_NUMBER;
        return (int) Math.pow(lastNumber, 2);
    }
}
