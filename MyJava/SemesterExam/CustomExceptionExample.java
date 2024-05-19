// Custom unchecked exception class
class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulating a situation where the custom exception is thrown
            throwCustomUncheckedException();
        } catch (CustomUncheckedException e) {
            System.out.println("Caught CustomUncheckedException: " + e.getMessage());
        }
    }

    // Method that throws the custom unchecked exception
    private static void throwCustomUncheckedException() {
        // Some logic that leads to the exception being thrown
        throw new CustomUncheckedException("This is a custom unchecked exception.");
    }
}
