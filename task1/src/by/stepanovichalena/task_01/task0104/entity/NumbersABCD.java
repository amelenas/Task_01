package by.stepanovichalena.task_01.task0104.entity;

import java.util.Objects;

public class NumbersABCD {
    private int pointABCD;

    public NumbersABCD() {
    }

    public int getPointABCD() {
        return pointABCD;
    }

    public void setPointABCD(int pointABCD) {
        this.pointABCD = pointABCD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NumbersABCD)) return false;
        NumbersABCD a = (NumbersABCD) o;
        return getPointABCD() == a.getPointABCD();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPointABCD());
    }
}
