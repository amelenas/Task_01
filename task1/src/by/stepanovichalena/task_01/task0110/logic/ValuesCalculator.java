package by.stepanovichalena.task_01.task0110.logic;

import by.stepanovichalena.task_01.exception.Task01Exception;

import java.util.Map;
import java.util.TreeMap;

public class ValuesCalculator {

    public Map<Double, Double> valuesCalculator(double pointA, double pointB, double stepH) throws Task01Exception {
        Map<Double, Double> result = new TreeMap<>();

        if (stepH <= 0) {
            throw new Task01Exception("The step h can't be less than or equals to 0");
        }
        while (pointA <= pointB) {
            double f = Math.tan(pointA);
            result.put(pointA, f);
            pointA = pointA + stepH;
        }
        return result;
    }
}
