
import java.util.Scanner;
public class IfStatement {
    public static void main(String[] args) {

        // If statment --> Performs a block of code if the condition is true

        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;


        System.out.print("Enter your name:");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student (true/false):");
        isStudent = scanner.nextBoolean();


        // Condition For name

        if(name.isEmpty()){
             System.out.println("You didn't enter your name !");
        }
        else{
            System.out.println("Hello " + name + "!");
        }


        // Condition For Age

       if (age>= 60) {
            System.out.println("You are a Senior");
            
        }
       else if (age>=18) {
            System.out.println("You are an Adult !");
        }
        
        else if (age <= 0) {
            System.out.println("TF You haven't been born yet !!! ");
            
        }
        else {
            System.out.println("You are a Child !");
        }

        // for student

        if(isStudent){
             System.out.println("You are a student ");
        }
        else{
            System.out.println("You are not a student ! ");
        }



        scanner.close();

    }
}
