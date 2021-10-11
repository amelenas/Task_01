package test.stepanovich.task_01.task0105;

import by.stepanovichalena.task_01.task0105.logic.IsPerfectNumber;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsPerfectNumberTest {

    @Test
    public void isPerfectNumberTrue() {
        IsPerfectNumber isPerfectNumber = new IsPerfectNumber();
        boolean expected = true;
        boolean actual = isPerfectNumber.isPerfectNumber(6);
        assertEquals(expected,actual);
    }

    @Test
    public void isPerfectNumberFalse() {
        IsPerfectNumber isPerfectNumber = new IsPerfectNumber();
        boolean expected = false;
        boolean actual = isPerfectNumber.isPerfectNumber(5);
        assertEquals(expected,actual);
    }

    @Test
    public void isPerfectNumberZero() {
        IsPerfectNumber isPerfectNumber = new IsPerfectNumber();
        boolean expected = true;
        boolean actual = isPerfectNumber.isPerfectNumber(0);
        assertEquals(expected,actual);
    }
}