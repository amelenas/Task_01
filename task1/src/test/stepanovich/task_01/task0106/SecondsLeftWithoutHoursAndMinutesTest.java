package test.stepanovich.task_01.task0106;

import by.stepanovichalena.task_01.exception.Task01Exception;
import by.stepanovichalena.task_01.task0106.logic.SecondsLeftWithoutHoursAndMinutes;
import static org.junit.Assert.*;
import org.junit.Test;

public class SecondsLeftWithoutHoursAndMinutesTest {

    @Test
    public void secondsLeft() throws Task01Exception {
        SecondsLeftWithoutHoursAndMinutes secondsLeftWithoutHoursAndMinutes = new SecondsLeftWithoutHoursAndMinutes();
        int expected = 5;
        int actual = secondsLeftWithoutHoursAndMinutes.secondsLeft(7265);
        assertEquals(expected, actual);
    }

    @Test(expected = Task01Exception.class)
    public void secondsLeft2() throws Task01Exception {
        SecondsLeftWithoutHoursAndMinutes secondsLeftWithoutHoursAndMinutes = new SecondsLeftWithoutHoursAndMinutes();
        secondsLeftWithoutHoursAndMinutes.secondsLeft(458888);
    }

    @Test(expected = Task01Exception.class)
    public void secondsLeft3() throws Task01Exception {
        SecondsLeftWithoutHoursAndMinutes secondsLeftWithoutHoursAndMinutes = new SecondsLeftWithoutHoursAndMinutes();
        secondsLeftWithoutHoursAndMinutes.secondsLeft(-65);
    }
}