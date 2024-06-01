package Exceptions;

public class InvalidPasswordException extends InvalidInfoException {
    public InvalidPasswordException(String message) {
        super(message);
    }
    public InvalidPasswordException() {
        this("Invalid username");
    }
}
