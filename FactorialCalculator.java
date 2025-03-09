import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        
        // Validate input
        while (number < 0) {
            System.out.print("Invalid input! Please enter a non-negative integer: ");
            number = scanner.nextInt();
        }
        
        // Calculate and display factorial
        System.out.println("The factorial of " + number + " is: " + calculateFactorial(number));

        scanner.close();
    }

    // Method to calculate factorial
    public static long calculateFactorial(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
