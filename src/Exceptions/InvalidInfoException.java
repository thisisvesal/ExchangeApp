package Exceptions;

public class InvalidInfoException extends Exception {
    InvalidInfoException(String message) {
        super(message);
    }
    InvalidInfoException() {
        this("Invalid info");
    }
}