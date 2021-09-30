package by.stepanovichalena.task_01.task0104.logic;

public class IsTwoEvenNumbers {
    public boolean isTwoEvenNumbers(int a,int b, int c, int d) {
        int [] num = {a, b, c, d};
        int counter = 0;
        for (int numbers : num) {
            if (numbers % 2 == 0){
                counter++;
            }
        }
        return counter >= 2;
    }
}
