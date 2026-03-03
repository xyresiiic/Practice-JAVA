import java.util.Scanner;
public class TemratureConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String choice;
        double temp;
        double newTemp;

      System.out.println("<--------------------------------------->");
      System.out.println("          Temprature Conversion          ");
      System.out.println("<--------------------------------------->");
      System.out.print("Enter the temprature : ");
      temp = scanner.nextDouble();
      scanner.nextLine();
      System.out.print("Convert to fahrenhiet or Celsius ? (C/F) : ");
      choice = scanner.next().toUpperCase();

      newTemp = (choice.equals("C")) ? ( temp - 32 ) * 5 / 9 : (temp * 5 / 9) + 32;
      System.out.printf("The temprature will be :%.2f° %s " , newTemp,choice); 
    
        scanner.close();
        
    }
}
