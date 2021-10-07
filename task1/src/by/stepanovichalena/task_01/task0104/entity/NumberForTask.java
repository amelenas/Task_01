package by.stepanovichalena.task_01.task0104.entity;

public class NumberForTask {
    private int number;

    public NumberForTask() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o.getClass() != this.getClass()) return false;
        NumberForTask a = (NumberForTask) o;
        return getNumber() == a.getNumber();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result * prime + Integer.hashCode(number);
        return result;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "Number=" + number +
                '}';
    }
}
