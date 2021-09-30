package by.stepanovichalena.task_01.task0105.logic;

public class IsPerfectNumber {
    public boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        return sum == number;
    }
}
