import java.util.Scanner;
public class Logical {
    public static void main(String[] args) {


        // Logical operators
        // && --> AND
        // || --> OR
        // !  --> NOT


        String id = "admin";
        String pass = "admin@1";
        String pass2 = "admin1";

        String inputId;
        String inputPass;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your ID   : ");
        inputId = scanner.nextLine();
        System.out.print("Enter your Pass : ");
        inputPass = scanner.nextLine();

        if (!id.equals(inputId)) // NOT operator --> reverse the condition
        {
        System.out.println("---------- Invalid ID ---------");
        }
        else if (id.equals(inputId) && pass.equals(inputPass)) // AND operator --> both condition must be true
        {
        System.out.println("---------- Login Approved ----------");
        }  
        else if (pass2.equals(inputPass) || pass.equals(inputPass)) // OR operator --> at least one condition must be true
        {
        System.out.println("---------- Login Approved ----------");
        }
        else
        {
        System.out.println("---------- Wrong Details ---------");
        }

        scanner.close();

        
    }
}
