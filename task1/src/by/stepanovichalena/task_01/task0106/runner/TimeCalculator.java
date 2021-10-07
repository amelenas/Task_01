package by.stepanovichalena.task_01.task0106.runner;

import by.stepanovichalena.task_01.exception.Task01Exception;
import by.stepanovichalena.task_01.task0106.logic.HoursLeft;
import by.stepanovichalena.task_01.task0106.logic.MinutesLeftWithoutHours;
import by.stepanovichalena.task_01.task0106.logic.SecondsLeftWithoutHoursAndMinutes;
import by.stepanovichalena.task_01.reader.ConsoleReader;

public class TimeCalculator {

    public static void main(String[] args) {
        ConsoleReader reader = new ConsoleReader();
        int seconds = reader.readInt();
        HoursLeft hoursLeft = new HoursLeft();
        MinutesLeftWithoutHours minutesLeftWithoutHours = new MinutesLeftWithoutHours();
        SecondsLeftWithoutHoursAndMinutes secondsLeftWithoutHoursAndMinutes = new SecondsLeftWithoutHoursAndMinutes();

        try {
            System.out.println(hoursLeft.hoursLeft(seconds) + " hours "
                    + minutesLeftWithoutHours.minutesLeft(seconds) + " minutes "
                    + secondsLeftWithoutHoursAndMinutes.secondsLeft(seconds) + " seconds have passed");
        } catch (Task01Exception e) {
            e.printStackTrace();
        }
    }
}
