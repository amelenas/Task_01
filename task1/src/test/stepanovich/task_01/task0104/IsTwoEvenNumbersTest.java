package test.stepanovich.task_01.task0104;

import by.stepanovichalena.task_01.task0104.logic.IsTwoEvenNumbers;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsTwoEvenNumbersTest {

    @Test (expected = IllegalArgumentException.class)
    public void isTwoEvenNumbersOrMore1() {
        IsTwoEvenNumbers isTwoEvenNumbers = new IsTwoEvenNumbers();
        isTwoEvenNumbers.isTwoEvenNumbersOrMore(null);
    }

    @Test
    public void isTwoEvenNumbersOrMore2() {
        IsTwoEvenNumbers isTwoEvenNumbers = new IsTwoEvenNumbers();
        boolean expected = true;
        boolean actual = isTwoEvenNumbers.isTwoEvenNumbersOrMore(1,2,3,4,5,6);
        assertEquals(expected, actual);
    }

    @Test
    public void isTwoEvenNumbersOrMore3() {
        IsTwoEvenNumbers isTwoEvenNumbers = new IsTwoEvenNumbers();
        boolean expected = false;
        boolean actual = isTwoEvenNumbers.isTwoEvenNumbersOrMore(1,3,5,6,7,11);
        assertEquals(expected, actual);
    }
}