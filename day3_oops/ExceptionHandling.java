package day3_oops;
import java.util.Scanner;

// Custom Exception Class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionHandling {
    // Method that may throw exceptions
    public static int divide(int a, int b) throws ArithmeticException, CustomException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero! : throws exception"); // Throwing predefined exception
        }
        if (a < 0 || b < 0) {
            throw new CustomException("Negative numbers are not allowed! : custom exception"); // Throwing custom exception
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking user input
            System.out.print("Enter value for a: ");
            int a = scanner.nextInt();

            System.out.print("Enter value for b: ");
            int b = scanner.nextInt();

            // Calling divide method (which throws exceptions)
            int result = divide(a, b);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage()); // Handling division by zero
        } catch (CustomException e) {
            System.out.println("Custom Error: " + e.getMessage()); // Handling negative number case
        } catch (Exception e) {
            System.out.println("General Error: Invalid input! Please enter valid numbers."); // Handling input mismatch
        } finally {
            scanner.close(); // Closing resource in finally block
            System.out.println("Execution completed.");
        }
    }
}
