package by.stepanovichalena.task_01.reader;

import java.util.Scanner;

public class ConsoleReader {
    Scanner scanner = new Scanner(System.in);

    public int readInt() {
        int result;
       System.out.println("Enter an integer: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid number format.");
            scanner.nextLine();
        }
        result = scanner.nextInt();
        return result;
    }

    public double readDouble() {
        double result;
        System.out.println("Enter a decimal number: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid number format.");
            scanner.nextLine();
        }
        result = scanner.nextDouble();
        return result;
    }

    public String readString() {
        String result;
        System.out.println("Enter a value: ");
        result = scanner.nextLine();
        return result;
    }

}
