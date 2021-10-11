package test.stepanovich.task_01.task0102;

import by.stepanovichalena.task_01.exception.Task01Exception;
import by.stepanovichalena.task_01.task0102.logic.DaysInMonth;
import org.junit.Test;

import static org.junit.Assert.*;

public class DaysInMonthTest {

    @Test
    public void daysInMonth() throws Task01Exception {
        DaysInMonth daysInMonth = new DaysInMonth();
        int expected = 29;
        int actual = daysInMonth.daysInMonth(2, true);
        assertEquals(expected, actual);
    }
    @Test(expected = Task01Exception.class)
    public void daysInMonthZero() throws Task01Exception {
        DaysInMonth daysInMonth = new DaysInMonth();
        daysInMonth.daysInMonth(0, true);
    }

    @Test(expected = Task01Exception.class)
    public void daysInMonthNegative() throws Task01Exception {
        DaysInMonth daysInMonth = new DaysInMonth();
        daysInMonth.daysInMonth(-3, true);
    }

    @Test
    public void isLeapYearTrue() {
        DaysInMonth daysInMonth = new DaysInMonth();
        boolean expected = true;
        boolean actual = daysInMonth.isLeapYear(2020);
        assertEquals(expected, actual);
    }

    @Test
    public void isLeapYearFalse() {
        DaysInMonth daysInMonth = new DaysInMonth();
        boolean expected = false;
        boolean actual = daysInMonth.isLeapYear(2021);
        assertEquals(expected, actual);
    }

}