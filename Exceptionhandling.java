
import java.util.Scanner;

public class Exceptionhandling {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt(); 

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            int ans = num1 / num2;
            System.out.println("Result: " + ans);

        } catch (ArithmeticException e) {
            
            System.out.println("Error: You cannot divide by zero!");
        } catch (Exception e) {
          
            System.out.println("Error: Please enter valid integers.");
        } finally {
            scanner.close(); 
        }
    }
}