package Exceptions;

public class InvalidUsernameException extends InvalidInfoException {
    public InvalidUsernameException(String message) {
        super(message);
    }
    public InvalidUsernameException() {
        this("Invalid username");
    }
}
