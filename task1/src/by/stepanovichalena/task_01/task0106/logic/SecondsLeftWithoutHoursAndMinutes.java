package by.stepanovichalena.task_01.task0106.logic;

import by.stepanovichalena.task_01.exception.Task01Exception;

public class SecondsLeftWithoutHoursAndMinutes {
    private final int SECONDS_IN_DAY = 86400;
    private final int SECONDS_IN_MINUTES = 60;
    public int secondsLeft(int seconds) throws Task01Exception {
        if (seconds >= SECONDS_IN_DAY) {
            throw new Task01Exception("This is more than one day!");
        }
        if (seconds < 0){
            throw new Task01Exception("Seconds cannot be a negative number.");
        }
        return seconds % SECONDS_IN_MINUTES;
    }
}
