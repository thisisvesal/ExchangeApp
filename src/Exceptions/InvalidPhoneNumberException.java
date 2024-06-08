package Exceptions;

public class InvalidPhoneNumberException extends InvalidInfoException {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
    public InvalidPhoneNumberException() {
        this("Invalid username");
    }
}
