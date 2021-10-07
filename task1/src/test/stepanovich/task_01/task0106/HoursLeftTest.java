package test.stepanovich.task_01.task0106;

import by.stepanovichalena.task_01.exception.Task01Exception;
import by.stepanovichalena.task_01.task0106.logic.HoursLeft;
import static org.junit.Assert.*;
import org.junit.Test;

public class HoursLeftTest {

    @Test
    public void hoursLeft() throws Task01Exception {
        HoursLeft hoursLeft = new HoursLeft();
        int expected = 2;
        int actual = hoursLeft.hoursLeft(7200);
        assertEquals(expected, actual);
    }

    @Test(expected = Task01Exception.class)
    public void hoursLeft2() throws Task01Exception {
        HoursLeft hoursLeft = new HoursLeft();
        hoursLeft.hoursLeft(458888);
    }

    @Test(expected = Task01Exception.class)
    public void hoursLeft3() throws Task01Exception {
        HoursLeft hoursLeft = new HoursLeft();
        hoursLeft.hoursLeft(-354);
    }
}