package by.stepanovichalena.task_01.task0107.entity;

public class Points {
    private double x;
    private double y;

    public Points() {
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
        if (o == null) return false;
        if (o.getClass() == this.getClass()) return false;
        Points pointXYA = (Points) o;
        return getX() == pointXYA.getX() && getY() == pointXYA.getY();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result * prime + Double.hashCode(x);
        result = result * prime + Double.hashCode(y);
        return result;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
