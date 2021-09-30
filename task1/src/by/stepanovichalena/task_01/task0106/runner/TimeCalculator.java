package by.stepanovichalena.task_01.task0106.runner;

import by.stepanovichalena.task_01.exception.Task01Exception;
import by.stepanovichalena.task_01.task0106.logic.HoursLeft;
import by.stepanovichalena.task_01.task0106.logic.MinutesLeft;
import by.stepanovichalena.task_01.task0106.logic.SecondsLeft;
import by.stepanovichalena.task_01.reader.ConsoleReader;

public class TimeCalculator {

    public static void main(String[] args) {
        ConsoleReader reader = new ConsoleReader();
        int seconds = reader.readInt();
        HoursLeft hoursLeft = new HoursLeft();
        MinutesLeft minutesLeft = new MinutesLeft();
        SecondsLeft secondsLeft = new SecondsLeft();

        try {
            System.out.println(hoursLeft.hoursLeft(seconds) + " hours "
                    + minutesLeft.minutesLeft(seconds) + " minutes "
                    + secondsLeft.secondsLeft(seconds) + " seconds have passed");
        } catch (Task01Exception e) {
            e.printStackTrace();
        }
    }
}
