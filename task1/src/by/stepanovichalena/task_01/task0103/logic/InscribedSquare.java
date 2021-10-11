package by.stepanovichalena.task_01.task0103.logic;


import by.stepanovichalena.task_01.exception.Task01Exception;

public class InscribedSquare {

    public double areaOfInscribedSquare(double areaOfBigSquare) throws Task01Exception {
        if (areaOfBigSquare <= 0) {
            throw new Task01Exception("The area is less than or equals to 0");
        }
        return areaOfBigSquare / 2;
    }
}
