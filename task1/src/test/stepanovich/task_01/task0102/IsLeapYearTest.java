package test.stepanovich.task_01.task0102;

import by.stepanovichalena.task_01.task0102.logic.IsLeapYear;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsLeapYearTest {
    IsLeapYear isLeapYear = new IsLeapYear();

    @Test
    public void isLeapYearTrue() {
        boolean expected = true;
        boolean actual = isLeapYear.isLeapYear(2020);
        assertEquals(expected, actual);
    }

    @Test
    public void isLeapYearFalse() {
        boolean expected = false;
        boolean actual = isLeapYear.isLeapYear(2021);
        assertEquals(expected, actual);
    }
}