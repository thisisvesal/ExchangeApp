package Exceptions;

// This exception is thrown when a user tries to sign up with info that is already attached to someone
// aka, repetitive email address/phone number/username
public class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
    public UserAlreadyExistsException() {
        this("User already exists: sign up attempt");
    }
}
