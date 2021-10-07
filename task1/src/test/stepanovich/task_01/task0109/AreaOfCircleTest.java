package test.stepanovich.task_01.task0109;

import by.stepanovichalena.task_01.exception.Task01Exception;
import by.stepanovichalena.task_01.task0109.logic.AreaOfCircle;
import org.junit.Test;

import static org.junit.Assert.*;

public class AreaOfCircleTest {

    @Test
    public void areaOfCircle() throws Task01Exception {
        AreaOfCircle areaOfCircle = new AreaOfCircle();
        double expected = 314.1593;
        double actual = areaOfCircle.areaOfCircle(10);
        assertEquals(expected, actual, 0.01);
    }

    @Test (expected = Task01Exception.class)
    public void areaOfCircle2() throws Task01Exception {
        AreaOfCircle areaOfCircle = new AreaOfCircle();
        areaOfCircle.areaOfCircle(0);
    }

    @Test (expected = Task01Exception.class)
    public void areaOfCircle3() throws Task01Exception {
        AreaOfCircle areaOfCircle = new AreaOfCircle();
        areaOfCircle.areaOfCircle(-10);
    }
}