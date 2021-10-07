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
    public void daysInMonth2() throws Task01Exception {
        DaysInMonth daysInMonth = new DaysInMonth();
        daysInMonth.daysInMonth(0, true);
    }

    @Test(expected = Task01Exception.class)
    public void daysInMonth3() throws Task01Exception {
        DaysInMonth daysInMonth = new DaysInMonth();
        daysInMonth.daysInMonth(-3, true);
    }

}