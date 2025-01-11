package dina.com.sbproject.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message); // Call the parent constructor with the error message
    }
}
