package by.stepanovichalena.task_01.task0110.entity;

import java.util.Objects;

public class Step {
    private double step;

    public Step() {
    }


    public double getStep() {
        return step;
    }

    public void setStep(double step) {
        this.step = step;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o.getClass() == this.getClass()) return false;
        Step step1 = (Step) o;
        return step1.getStep() == getStep();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result * prime + Double.hashCode(step);
        return result;
    }
}
