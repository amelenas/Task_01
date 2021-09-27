package by.stepanovich.task1.isexisttwoevennumbers;

import java.util.Scanner;

public class DetermineEvenNumbers {
    private int[] numbers;

    public static void main(String[] args) {
        DetermineEvenNumbers determineEvenNumbers = new DetermineEvenNumbers();
        System.out.println(determineEvenNumbers.isTwoEvenNumbers());
    }

    public DetermineEvenNumbers() {
        this.numbers = numbersReader();
    }

    public boolean isTwoEvenNumbers() {
        int counter = 0;
        for (int num : numbers) {
            if (num % 2 == 0){
                counter++;
            }
        }
        return counter >= 2;
    }

    private int[] numbersReader() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];

        System.out.println("Enter four numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid number format.");
                scanner.nextLine();
            }
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

}
