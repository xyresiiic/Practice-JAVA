import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
        

        boolean isStudent;
        boolean isSenior;
        double price =199.00;

        Scanner scanner = new Scanner(System.in);

        System.out.print("  Are you a student ? (tuue/false) : ");
        isStudent = scanner.nextBoolean();
        System.out.print("  Are you a senior ? (tuue/false)  : ");
        isSenior = scanner.nextBoolean();

        scanner.close();

        System.out.println("<-------------------------------------------------------->");
        System.out.println("  The original ticket price is : "+ price );

        if (isStudent) {

            if (isSenior) {

                 System.out.println("  You will get a student discount of 10%");
                 System.out.println("  You will get a Senior discount of 20%");
                 price *= 0.7;
            }
            else {
                 System.out.println("  You will get a student discount");
                 price *= 0.9;
            }
            
        }

        else{

            if (isSenior) {

                System.out.println("  You will get a Senior discount of 20%");
                price *= 0.8;
            }
            else{
                price *= 1;
            }
        }

        System.out.printf("  You ticket price will be     : %.2f \n" ,price);
        System.out.println("<-------------------------------------------------------->");
    }
}
