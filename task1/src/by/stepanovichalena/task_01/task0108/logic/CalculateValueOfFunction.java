package by.stepanovichalena.task_01.task0108.logic;

public class CalculateValueOfFunction {
    public double calculateFunction(double number, boolean isNumberGreaterThanTree) {
        double result;
        if (isNumberGreaterThanTree) {
            result = Math.pow(-number, 2) + 3 * number + 9;
        } else {
            result = 1 / (Math.pow(number, 3) - 6);
        }
        return result;
    }
}
