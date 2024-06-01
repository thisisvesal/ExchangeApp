package Exceptions;

public class InvalidEmailException extends InvalidInfoException {
    public InvalidEmailException(String message) {
        super(message);
    }
    public InvalidEmailException() {
        this("Invalid username");
    }
}
