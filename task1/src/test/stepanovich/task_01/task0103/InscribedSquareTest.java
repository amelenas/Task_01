package test.stepanovich.task_01.task0103;

import by.stepanovichalena.task_01.exception.Task01Exception;
import by.stepanovichalena.task_01.task0103.logic.InscribedSquare;
import org.junit.Test;

import static org.junit.Assert.*;

public class InscribedSquareTest {

    @Test
    public void testAreaOfInscribedSquare() throws Task01Exception {
        InscribedSquare inscribedSquare = new InscribedSquare();
        double expected = 1.315;
        double actual = inscribedSquare.areaOfInscribedSquare(2.63);
        assertEquals(expected, actual, 0.01);
    }

    @Test(expected = Task01Exception.class)
    public void testAreaZero() throws Task01Exception {
        InscribedSquare inscribedSquare = new InscribedSquare();
        inscribedSquare.areaOfInscribedSquare(0);

    }

    @Test(expected = Task01Exception.class)
    public void testAreaNegative() throws Task01Exception {
        InscribedSquare inscribedSquare = new InscribedSquare();
        inscribedSquare.areaOfInscribedSquare(-36);

    }
}