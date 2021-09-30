package by.stepanovichalena.task_01.task0107.entity;

import java.util.Objects;

public class PointsAB {
    private double x;
    private double y;

    public PointsAB() {
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PointsAB)) return false;
        PointsAB pointXYA = (PointsAB) o;
        return getX() == pointXYA.getX() && getY() == pointXYA.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }
}
