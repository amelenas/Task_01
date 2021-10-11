package test.stepanovich.task_01.task0107;

import by.stepanovichalena.task_01.task0107.entity.Points;
import by.stepanovichalena.task_01.task0107.logic.CloserPoint;
import static org.junit.Assert.*;
import org.junit.Test;

public class CloserPointTest {

    @Test
    public void showCloserPointEqual() {
        CloserPoint closerPoint = new CloserPoint();
        Points pointsA = new Points();
        Points pointsB = new Points();
        pointsA.setX(0);
        pointsA.setY(0);
        pointsB.setX(0);
        pointsB.setY(0);
        int expected = 0;
        int actual = closerPoint.closerPoint(pointsA.getX(), pointsA.getY(), pointsB.getX(), pointsB.getY());
        assertEquals(expected, actual);
    }

    @Test
    public void showCloserPointACloser() {
        CloserPoint closerPoint = new CloserPoint();
        Points pointsA = new Points();
        Points pointsB = new Points();
        pointsA.setX(10);
        pointsA.setY(10);
        pointsB.setX(20);
        pointsB.setY(20);
        int expected = 1;
        int actual = closerPoint.closerPoint(pointsA.getX(), pointsA.getY(), pointsB.getX(), pointsB.getY());
        assertEquals(expected, actual);
    }

    @Test
    public void showCloserPointBCloser() {
        CloserPoint closerPoint = new CloserPoint();
        Points pointsA = new Points();
        Points pointsB = new Points();
        pointsA.setX(20);
        pointsA.setY(20);
        pointsB.setX(10);
        pointsB.setY(10);
        int expected = -1;
        int actual = closerPoint.closerPoint(pointsA.getX(), pointsA.getY(), pointsB.getX(), pointsB.getY());
        assertEquals(expected, actual);
    }
}