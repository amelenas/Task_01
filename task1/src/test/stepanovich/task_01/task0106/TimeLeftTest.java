package test.stepanovich.task_01.task0106;

import by.stepanovichalena.task_01.exception.Task01Exception;
import by.stepanovichalena.task_01.task0106.logic.TimeLeft;
import static org.junit.Assert.*;
import org.junit.Test;

public class TimeLeftTest {

    @Test
    public void hoursLeft() throws Task01Exception {
        TimeLeft timeLeft = new TimeLeft();
        int expected = 2;
        int actual = timeLeft.hoursLeft(7200);
        assertEquals(expected, actual);
    }

    @Test(expected = Task01Exception.class)
    public void hoursLeftMoreThanDay() throws Task01Exception {
        TimeLeft timeLeft = new TimeLeft();
        timeLeft.hoursLeft(458888);
    }

    @Test(expected = Task01Exception.class)
    public void hoursLeftNegative() throws Task01Exception {
        TimeLeft timeLeft = new TimeLeft();
        timeLeft.hoursLeft(-354);
    }
    @Test
    public void minutesLeft() throws Task01Exception {
        TimeLeft minutesLeftWithoutHours = new TimeLeft();
        int expected = 1;
        int actual = minutesLeftWithoutHours.minutesLeft(7260);
        assertEquals(expected, actual);
    }

    @Test(expected = Task01Exception.class)
    public void minutesLeftMoreThanDay() throws Task01Exception {
        TimeLeft minutesLeftWithoutHours = new TimeLeft();
        minutesLeftWithoutHours.minutesLeft(4565432);
    }

    @Test(expected = Task01Exception.class)
    public void minutesLeftNegative() throws Task01Exception {
        TimeLeft minutesLeftWithoutHours = new TimeLeft();
        minutesLeftWithoutHours.minutesLeft(-354);
    }
    @Test
    public void secondsLeft() throws Task01Exception {
        TimeLeft secondsLeftWithoutHoursAndMinutes = new TimeLeft();
        int expected = 5;
        int actual = secondsLeftWithoutHoursAndMinutes.secondsLeft(7265);
        assertEquals(expected, actual);
    }

    @Test(expected = Task01Exception.class)
    public void secondsLeftMoreThanDay() throws Task01Exception {
        TimeLeft secondsLeftWithoutHoursAndMinutes = new TimeLeft();
        secondsLeftWithoutHoursAndMinutes.secondsLeft(458888);
    }

    @Test(expected = Task01Exception.class)
    public void secondsLeftNegative() throws Task01Exception {
        TimeLeft secondsLeftWithoutHoursAndMinutes = new TimeLeft();
        secondsLeftWithoutHoursAndMinutes.secondsLeft(-65);
    }
}