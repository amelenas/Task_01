package test.stepanovich.task_01.task0108;

import by.stepanovichalena.task_01.task0108.logic.CalculateValueOfFunction;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateValueOfFunctionTest {

    @Test
    public void functionMoreThanThree() {
        CalculateValueOfFunction calculateValueOfFunction = new CalculateValueOfFunction();
        double expected = 37;
        double actual = calculateValueOfFunction.calculateFunction(4);
        assertEquals(expected, actual, 0.001);
    }
    @Test
    public void functionLessThanThree () {
        CalculateValueOfFunction calculateValueOfFunction = new CalculateValueOfFunction();
        double expected = 0.5;
        double actual = calculateValueOfFunction.calculateFunction(2);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void functionZero() {
        CalculateValueOfFunction calculateValueOfFunction = new CalculateValueOfFunction();
        double expected = -0.16666;
        double actual = calculateValueOfFunction.calculateFunction(0);
        assertEquals(expected, actual, 0.001);
    }
}