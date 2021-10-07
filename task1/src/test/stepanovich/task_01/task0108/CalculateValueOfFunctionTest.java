package test.stepanovich.task_01.task0108;

import by.stepanovichalena.task_01.task0108.logic.CalculateValueOfFunction;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateValueOfFunctionTest {

    @Test
    public void calculateFunction() {
        CalculateValueOfFunction calculateValueOfFunction = new CalculateValueOfFunction();
        double expected = 27;
        double actual = calculateValueOfFunction.calculateFunction(3, true);
        assertEquals(expected, actual, 0.001);
    }
    @Test
    public void calculateFunction2() {
        CalculateValueOfFunction calculateValueOfFunction = new CalculateValueOfFunction();
        double expected = 0.5;
        double actual = calculateValueOfFunction.calculateFunction(2, false);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void calculateFunction3() {
        CalculateValueOfFunction calculateValueOfFunction = new CalculateValueOfFunction();
        double expected = -0.16666;
        double actual = calculateValueOfFunction.calculateFunction(0, false);
        assertEquals(expected, actual, 0.001);
    }
}