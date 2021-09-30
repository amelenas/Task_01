package by.stepanovichalena.task_01.task0106.logic;

import by.stepanovichalena.task_01.exception.Task01Exception;

public class MinutesLeft {
    public int minutesLeft(int seconds) throws Task01Exception {
        if (seconds >= 86400) {
            throw new Task01Exception("This is more than one day!");
        }
        if (seconds < 0){
            throw new Task01Exception("Seconds cannot be a negative number.");
        }
        return (seconds % 3600 / 60);
    }
}
