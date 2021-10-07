package test.stepanovich.task_01.task0103;

import by.stepanovichalena.task_01.exception.Task01Exception;
import by.stepanovichalena.task_01.task0103.logic.TimesInSquareCounter;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimesInSquareCounterTest {

    @Test
    public void timesInSquareCounter() throws Task01Exception {
        TimesInSquareCounter timesInSquareCounter = new TimesInSquareCounter();
        double expected = 1.315;
        double actual = timesInSquareCounter.timesInSquareCounter(2.63);
        assertEquals(expected, actual, 0.01);
    }

    @Test(expected = Task01Exception.class)
    public void testArea() throws Task01Exception {
        TimesInSquareCounter timesInSquareCounter = new TimesInSquareCounter();
        timesInSquareCounter.timesInSquareCounter(0);

    }

    @Test(expected = Task01Exception.class)
    public void testArea2() throws Task01Exception {
        TimesInSquareCounter timesInSquareCounter = new TimesInSquareCounter();
        timesInSquareCounter.timesInSquareCounter(-36);

    }
}