package day3_oops;
import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Taking input for a and b
            System.out.print("Enter value for a: ");
            int a = scanner.nextInt();

            System.out.print("Enter value for b: ");
            int b = scanner.nextInt();

            // Performing division
            int result = a / b;
            System.out.println("Result of a / b: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter integers only.");
        } finally {
            scanner.close(); // Closing the scanner resource
            System.out.println("Execution completed.");
        }
    }
}


