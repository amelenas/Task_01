package by.stepanovichalena.task_01.task0110.entity;

import java.util.Objects;

public class StepH {
    private double step;

    public StepH() {
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
        if (!(o instanceof StepH)) return false;
        StepH step1 = (StepH) o;
        return Double.compare(step1.getStep(), getStep()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStep());
    }
}
