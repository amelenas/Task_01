package by.stepanovichalena.task_01.task0110.entity;

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
        if (o == null) return false;
        if (o.getClass() == this.getClass()) return false;
        Points pointsAB = (Points) o;
        return pointsAB.getPoint() == getPoint();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result * prime + Double.hashCode(point);
        return result;
    }
}
