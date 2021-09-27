package by.stepanovich.task1.valuesoffunctiononsegment;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class TableOfFunctionValues {
    private double[] values;

    public static void main(String[] args) {
        TableOfFunctionValues tableOfFunctionValues = new TableOfFunctionValues();
        tableOfFunctionValues.showResult();
    }

    public TableOfFunctionValues() {
        this.values = pointsReader();
    }

    public void showResult() {
        String[] columnNames = {"Argument values", "Function values"};
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JScrollPane jScrollPane = new JScrollPane(new JTable(tableBuilder(), columnNames));
        jFrame.getContentPane().add(jScrollPane);
        jFrame.setPreferredSize(new Dimension(400, 400));
        jFrame.pack();
        jFrame.setVisible(true);


    }

    private String[][] tableBuilder() {
        int i = 0;
        Map<Double, Double> resultForTable = valuesCalculator();
        String[][] valuesForTable = new String[resultForTable.size()][2];
        for (Map.Entry<Double, Double> entry : resultForTable.entrySet()) {
            valuesForTable[i][0] = String.format("%.3f", entry.getKey());
            valuesForTable[i][1] = String.format("%.3f", entry.getValue());
            i++;
        }
        return valuesForTable;
    }


    private Map<Double, Double> valuesCalculator() {

        Map<Double, Double> result = new TreeMap<>();
        double a = values[0];
        double b = values[1];
        double h = values[2];
        if (h < 0) {
            h *= -1;
            System.out.println("Step h converted into number " + h);
        }
        while (a <= b) {
            double f = Math.tan(a);
            result.put(a, f);
            a = a + h;
        }
        return result;
    }


    private double[] pointsReader() {
        double value;
        double[] result = new double[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            do {
                switch (i) {
                    case 0:
                        System.out.println("Enter point a:");
                        break;
                    case 1:
                        System.out.println("Enter point b:");
                        break;
                    case 2:
                        System.out.println("Enter step h:");
                        break;
                }

                while (!scanner.hasNextDouble()) {
                    System.out.println("Invalid number format.");
                    scanner.nextLine();
                }
                value = scanner.nextDouble();
                if (value == 0 && i==2) {
                    System.out.println("h can't equal 0");
                }
            } while (value == 0 && i==2);
            result[i] = value;
        }
        return result;
    }
}

