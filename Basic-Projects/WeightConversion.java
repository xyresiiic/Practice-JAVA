import java.util.Scanner;
public class WeightConversion {

    public static void main (String [] args){

        // Weight Conversion

        // Declare variables --> welcome message --> take user input --> option 1 --> option 2 --> else(invaild) 

        Scanner scanner = new Scanner(System.in);
       
        System.out.println("<--------------------------------------->");
        System.out.println("             Weight Conversion           ");
        System.out.println("<--------------------------------------->");

        int choice;
        double weight;
        double newWeight;

        System.out.println("Option 1 : Convert lbs to Kg");
        System.out.println("Option 1 : Convert Kg to lbs");

        System.out.print("Enter your choice : ");
        choice = scanner.nextInt();

        if (choice == 1) 
        {
            System.out.print("Enter your Weight in lbs : ");
            weight = scanner.nextDouble();
            newWeight = weight*0.453592;
            System.out.printf("Your weight in Kg will be : %.2f", newWeight);
        }
        else if (choice == 2) 
        {
            System.out.print("Enter your Weight in Kg : ");
            weight = scanner.nextDouble();
            newWeight = weight*2.20462;
            System.out.printf("Your weight in lbs will be : %.2f", newWeight);
        }
        else
        {
            System.out.print("----------Invaild Input----------");
        }
    

        System.out.print("\n");
        System.out.println("<--------------------------------------->");
        scanner.close();
  

    }
    
}
