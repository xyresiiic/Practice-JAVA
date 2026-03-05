import java.util.Scanner;
public class SimpleCalculator {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("<--------------------------------------->");
        System.out.println("            Simple calculator            ");
        System.out.println("<--------------------------------------->");


        System.out.print("  Enter 1st number      : ");
        double a = scanner.nextDouble();


        System.out.println("  1. Addition");
        System.out.println("  2. Subtraction");
        System.out.println("  3. multiplication");
        System.out.println("  4. Division");
        System.out.println("  5. Power");
        System.out.print("  Enter your choice     : ");
        char choice = scanner.next().charAt(0);


        System.out.print("  Enter 2nd number      : ");
        double b = scanner.nextDouble();


        System.out.println("<--------------------------------------->");
        switch (choice) 
        {
            case '1' -> System.out.println("  The addition is       : " + (a+b));
            case '2' -> System.out.println("  The subtraction is    : " + (a-b));
            case '3' -> System.out.println("  The multiplication is : " + (a*b));

            case '4' -> {
                if (b==0) {
                    System.out.println("  Division by zero is not possilble");
                }
                else
                {
                System.out.println("  The division is       : " + (a/b));
                }
            }

            case '5' -> System.out.println("The Resultt  is       : " + Math.pow(a, b));
            default  -> System.out.println("not a vaild input");
    
        }
        System.out.println("<--------------------------------------->");



        scanner.close();
        
    }
    
}
