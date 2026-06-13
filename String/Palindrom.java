import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;   // store original number
        int reverse = 0;

        // Loop to reverse the number
        while(num != 0) {
            int digit = num % 10;      // get last digit
            reverse = reverse * 10 + digit;  // build reversed number
            num = num / 10;            // remove last digit
        }

        // Check palindrome
        if(original == reverse) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is Not Palindrome");
        }

        sc.close();
    }
}