package by.stepanovichalena.task_01.task0103.logic;

import by.stepanovichalena.task_01.exception.Task01Exception;

public class TimesInSquareCounter {
    public double timesInSquareCounter(double areaOfBigSquare) throws Task01Exception {
        if (areaOfBigSquare <= 0) {
            throw new Task01Exception("The area can't be less than or equals to 0");
        }
        return areaOfBigSquare / (areaOfBigSquare / 2);
    }
}
