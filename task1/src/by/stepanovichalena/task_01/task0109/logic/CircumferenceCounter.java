package by.stepanovichalena.task_01.task0109.logic;

import by.stepanovichalena.task_01.exception.Task01Exception;

public class CircumferenceCounter {
    public double circumferenceCounter(double radius) throws Task01Exception {
        if (radius <= 0) {
            throw new Task01Exception("The radius is less than or equals to 0");
        }
        return 2 * Math.PI * radius;
    }
}
