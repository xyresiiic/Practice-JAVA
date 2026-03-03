import java.util.Scanner;
public class SubString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your email : ");
        String email = scanner.nextLine();
        

        if (email.contains("@")) 
        {
        // to find the username from email || uses ----> stringName.substring(startIndex, endIndex) 
        String userName = email.substring(0, email.indexOf('@'));
        System.out.println("Your username is : " + userName);

        // to find the domain from email || uses ----> stringNmae.substring(startIndex)
        String domain = email.substring(email.indexOf('@') + 1);
        System.out.println("Your domain is : " + domain);
        }
        else
        {
        System.out.println("Email must contain @");
        }


        scanner.close();
        
    }
}
