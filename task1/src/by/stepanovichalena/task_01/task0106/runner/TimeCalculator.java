package by.stepanovichalena.task_01.task0106.runner;

import by.stepanovichalena.task_01.exception.Task01Exception;
import by.stepanovichalena.task_01.task0106.logic.TimeLeft;
import by.stepanovichalena.task_01.reader.ConsoleReader;

public class TimeCalculator {

    public static void main(String[] args) {
        ConsoleReader reader = new ConsoleReader();
        int seconds = reader.readInt();
        TimeLeft timeLeft = new TimeLeft();


        try {
            System.out.println(timeLeft.hoursLeft(seconds) + " hours "
                    + timeLeft.minutesLeft(seconds) + " minutes "
                    + timeLeft.secondsLeft(seconds) + " seconds have passed");
        } catch (Task01Exception e) {
            e.printStackTrace();
        }
    }
}
