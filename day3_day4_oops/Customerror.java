package day3_day4_oops;
import java.util.Scanner;

// Custom Exception for Age Validation
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

// Age class that validates age
class Age {
    private int age;

    // Constructor to set age
    public Age(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or above!");
        }
        this.age = age;
        System.out.println("Valid Age: " + this.age);
    }
}

// Demo class with main() method
public class Customerror {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking user input for age
            System.out.print("Enter your age: ");
            int userAge = scanner.nextInt();

            // Creating Age object (which may throw an exception)
            Age ageObj = new Age(userAge);

        } catch (AgeException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: Please enter a valid number.");
        } finally {
            scanner.close(); // Ensuring scanner is closed
            System.out.println("Execution completed.");
        }
    }
}
