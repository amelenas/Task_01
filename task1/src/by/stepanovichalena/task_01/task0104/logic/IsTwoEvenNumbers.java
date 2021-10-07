package by.stepanovichalena.task_01.task0104.logic;

public class IsTwoEvenNumbers {
    public boolean isTwoEvenNumbersOrMore(int ... numbers) {
        if(numbers == null){
            throw new IllegalArgumentException();
        }
        int counter = 0;
        for (int num : numbers) {
            if (num % 2 == 0){
                counter++;
            }
        }
        return counter >= 2;
    }
}
