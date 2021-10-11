package test.stepanovich.task_01.task0110;

import by.stepanovichalena.task_01.exception.Task01Exception;
import by.stepanovichalena.task_01.task0110.logic.ValuesCalculator;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class ValuesCalculatorTest {

    @Test
    public void valuesCalculator() throws Task01Exception {
        ValuesCalculator valuesCalculator = new ValuesCalculator();
        Map<Double, Double> expected = new TreeMap<>();
        expected.put(1.0, 1.557);
        expected.put(2.0, -2.185);
        expected.put(3.0, -0.142);
        expected.put(4.0, 1.157);
        expected.put(5.0, -3.380);
        expected.put(6.0, -0.291);
        expected.put(7.0, 0.871);
        expected.put(8.0, -6.799);
        expected.put(9.0, -0.452);
        expected.put(10.0, 0.648);
        Map<Double, Double> actual = valuesCalculator.valuesCalculator(1, 10, 1);
        double expectedSum = 0;
        double actualSum = 0;
        for (Double x: expected.keySet()){
            expectedSum += expected.get(x);
        }
        for (Double y: actual.keySet()){
            actualSum += actual.get(y);
        }
        assertEquals(expectedSum, actualSum, 0.001);
    }

    @Test(expected = Task01Exception.class)
    public void valuesCalculatorZeroH() throws Task01Exception {
        ValuesCalculator valuesCalculator = new ValuesCalculator();
        valuesCalculator.valuesCalculator(1, 10, 0);

    }

    @Test(expected = Task01Exception.class)
    public void valuesCalculatorNegativeH() throws Task01Exception {
        ValuesCalculator valuesCalculator = new ValuesCalculator();
        valuesCalculator.valuesCalculator(1, 10, -10);

    }
}