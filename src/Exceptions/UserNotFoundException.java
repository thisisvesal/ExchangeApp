package Exceptions;

// This exception is thrown when the input info in login is not attached to anyone
public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
    public UserNotFoundException() {
        this("User not found");
    }
}
