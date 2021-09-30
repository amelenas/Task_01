package by.stepanovichalena.task_01.task0110.entity;

import java.util.Objects;

public class Points {
    private double point;


    public Points() {
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Points)) return false;
        Points pointsAB = (Points) o;
        return Double.compare(pointsAB.getPoint(), getPoint()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPoint());
    }
}
