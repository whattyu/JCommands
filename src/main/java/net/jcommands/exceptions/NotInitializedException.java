package net.jcommands.exceptions;

public class NotInitializedException extends Exception {
    public NotInitializedException() {
        super();
    }
    public NotInitializedException(String reason) {
        super(reason);
    }
}
