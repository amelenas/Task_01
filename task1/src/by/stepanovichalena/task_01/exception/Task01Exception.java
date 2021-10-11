package by.stepanovichalena.task_01.exception;

public class Task01Exception extends Exception {

    public Task01Exception() {
    }

    public Task01Exception(String message) {
        super(message);
    }

    public Task01Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Task01Exception(Throwable cause) {
        super(cause);
    }
}
