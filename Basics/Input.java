import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        

        System.out.print("Enter Your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Your name: ");
        String name = scanner.nextLine();
        scanner.nextLine();  // to clear the input buffer (/n) otherwise it will show an error (both for int/double).

        System.out.print("Enter Your CGPA: ");
        double cgpa = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Are you a student (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("------------------------------------ ");
        System.out.println("Your Name is : "+ name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your CGPA is : "+ cgpa);

        if (isStudent) {
        System.out.println("You are a student");   
        }
        else{
        System.out.println("You are not a student");
        }
       

        scanner.close();


    }
}
