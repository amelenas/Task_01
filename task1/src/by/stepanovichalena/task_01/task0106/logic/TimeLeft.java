package by.stepanovichalena.task_01.task0106.logic;

import by.stepanovichalena.task_01.exception.Task01Exception;

public class TimeLeft {
    private final String messageMoreThanDay = "The entered value is more than one day!";
    private final String messageNegativeNumber = "Seconds cannot be a negative number.";

    private static final int SECONDS_IN_DAY = 86400;
    private static final int SECONDS_IN_HOUR = 3600;
    private static final int SECONDS_IN_MINUTES = 60;


    public int hoursLeft(int seconds) throws Task01Exception {

        if (seconds >= SECONDS_IN_DAY) {
            throw new Task01Exception(messageMoreThanDay);
        }
        if (seconds < 0) {
            throw new Task01Exception(messageNegativeNumber);
        }
        return seconds / SECONDS_IN_HOUR;
    }

    public int secondsLeft(int seconds) throws Task01Exception {
        if (seconds >= SECONDS_IN_DAY) {
            throw new Task01Exception(messageMoreThanDay);
        }
        if (seconds < 0) {
            throw new Task01Exception(messageNegativeNumber);
        }
        return seconds % SECONDS_IN_MINUTES;
    }

    public int minutesLeft(int seconds) throws Task01Exception {
        if (seconds >= SECONDS_IN_DAY) {
            throw new Task01Exception(messageMoreThanDay);
        }
        if (seconds < 0) {
            throw new Task01Exception(messageNegativeNumber);
        }
        return (seconds % SECONDS_IN_HOUR / SECONDS_IN_MINUTES);
    }
}
