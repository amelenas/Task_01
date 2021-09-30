package by.stepanovichalena.task_01.task0107.logic;

public class CloserPoint {
    public int showCloserPoint(double x1, double y1, double x2, double y2) {
        int result = 0;
        double a = Math.pow(x1, 2) + Math.pow(y1, 2);
        double b = Math.pow(x2, 2) + Math.pow(y2, 2);

        if (a < b) {
            result = 1;
        }
        if (a > b) {
            result = -1;
        }
        return result;
    }
}
