package test.stepanovich.task_01.task0101;

import by.stepanovichalena.task_01.task0101.logic.SquareOfNumber;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareOfNumberTest {

    @Test
    public void squareCalculator() {
        SquareOfNumber squareOfNumber = new SquareOfNumber();
        int expected = 25;
        int actual = squareOfNumber.squareCalculator(25);
        assertEquals(expected, actual);
    }

    @Test
    public void squareCalculator2() {
        SquareOfNumber squareOfNumber = new SquareOfNumber();
        int expected = 25;
        int actual = squareOfNumber.squareCalculator(-25);
        assertEquals(expected, actual);
    }

}