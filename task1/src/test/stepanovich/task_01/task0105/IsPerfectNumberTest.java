package test.stepanovich.task_01.task0105;

import by.stepanovichalena.task_01.task0105.logic.IsPerfectNumber;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsPerfectNumberTest {

    @Test
    public void isPerfectNumber() {
        IsPerfectNumber isPerfectNumber = new IsPerfectNumber();
        boolean expected = true;
        boolean actual = isPerfectNumber.isPerfectNumber(6);
        assertEquals(expected,actual);
    }

    @Test
    public void isPerfectNumber2() {
        IsPerfectNumber isPerfectNumber = new IsPerfectNumber();
        boolean expected = false;
        boolean actual = isPerfectNumber.isPerfectNumber(5);
        assertEquals(expected,actual);
    }
}