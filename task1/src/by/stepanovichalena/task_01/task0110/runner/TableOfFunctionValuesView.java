package by.stepanovichalena.task_01.task0110.runner;

import by.stepanovichalena.task_01.exception.Task01Exception;
import by.stepanovichalena.task_01.reader.ConsoleReader;
import by.stepanovichalena.task_01.task0110.entity.Points;
import by.stepanovichalena.task_01.task0110.entity.Step;
import by.stepanovichalena.task_01.task0110.logic.ValuesCalculator;

import java.util.Iterator;
import java.util.Map;

public class TableOfFunctionValuesView {

    public static void main(String[] args) {
        Points a = new Points();
        Points b = new Points();
        Step stepH = new Step();
        ValuesCalculator valuesCalculator = new ValuesCalculator();

        ConsoleReader consoleReader = new ConsoleReader();
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    System.out.println("Enter point a:");
                    a.setPoint(consoleReader.readDouble());
                    break;
                case 1:
                    System.out.println("Enter point b:");
                    b.setPoint(consoleReader.readDouble());
                    break;
                case 2:
                    System.out.println("Enter step h:");
                    stepH.setStep(consoleReader.readDouble());
                    break;
            }
        }
        try {
            Iterator<Map.Entry<Double, Double>> iterator = valuesCalculator.valuesCalculator(a.getPoint(),
                    b.getPoint(), stepH.getStep()).entrySet().iterator();
            System.out.println("| Argument values | Function values |");
            while (iterator.hasNext()) {
                Map.Entry<Double, Double> pair = iterator.next();
                System.out.printf("|%16.3f | %16.3f|%n", pair.getKey(), pair.getValue());
            }
        } catch(Task01Exception e)    {
        e.printStackTrace();
    }
  }
}
