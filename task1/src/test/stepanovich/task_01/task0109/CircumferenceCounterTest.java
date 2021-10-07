package test.stepanovich.task_01.task0109;

import by.stepanovichalena.task_01.exception.Task01Exception;
import by.stepanovichalena.task_01.task0109.logic.CircumferenceCounter;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircumferenceCounterTest {

    @Test
    public void circumferenceCounter() throws Task01Exception {
        CircumferenceCounter circumferenceCounter = new CircumferenceCounter();
        double expected = 125.6637;
        double actual = circumferenceCounter.circumferenceCounter(20);
        assertEquals(expected, actual, 0.01);
    }

    @Test (expected = Task01Exception.class)
    public void areaOfCircle2() throws Task01Exception {
        CircumferenceCounter circumferenceCounter = new CircumferenceCounter();
        circumferenceCounter.circumferenceCounter(0);
    }

    @Test (expected = Task01Exception.class)
    public void areaOfCircle3() throws Task01Exception {
        CircumferenceCounter circumferenceCounter = new CircumferenceCounter();
        circumferenceCounter.circumferenceCounter(-20);
    }
}