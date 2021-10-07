package test.stepanovich.task_01.task0106;

import by.stepanovichalena.task_01.exception.Task01Exception;
import by.stepanovichalena.task_01.task0106.logic.MinutesLeftWithoutHours;
import static org.junit.Assert.*;
import org.junit.Test;

public class MinutesLeftWithoutHoursTest {

    @Test
    public void minutesLeft() throws Task01Exception {
        MinutesLeftWithoutHours minutesLeftWithoutHours = new MinutesLeftWithoutHours();
        int expected = 1;
        int actual = minutesLeftWithoutHours.minutesLeft(7260);
        assertEquals(expected, actual);
    }

    @Test(expected = Task01Exception.class)
    public void minutesLeft2() throws Task01Exception {
        MinutesLeftWithoutHours minutesLeftWithoutHours = new MinutesLeftWithoutHours();
        minutesLeftWithoutHours.minutesLeft(4565432);
    }

    @Test(expected = Task01Exception.class)
    public void minutesLeft3() throws Task01Exception {
        MinutesLeftWithoutHours minutesLeftWithoutHours = new MinutesLeftWithoutHours();
        minutesLeftWithoutHours.minutesLeft(-354);
    }
}