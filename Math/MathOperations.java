import java.util.Scanner;
public class MathOperations {
    public static void main(String[] args) {
        
      // For finding HYPOTENUSE = Math.sqrt(a²+b²)


      Scanner scanner = new Scanner(System.in);

      double a;
      double b;
      double c;

      System.out.println("<----------------------------------------->");
      System.out.println("                HYPOTENUSE                 ");
      System.out.println("<----------------------------------------->");

      System.out.print("  Enter length of side A     : ");
      a = scanner.nextDouble(); 
      System.out.print("  Enter length of side B     : ");
      b = scanner.nextDouble();

      c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); // used to Calculate HYPOTENUSE
      System.out.printf("  The Hypotenuse side (c) is : %.1fcm\n ",c);
      


      /*
      Circumference = 2 * Math.Pi * radius
      Area = Math.PI * Math.pow(radius, 2)
      Volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3)
      */

      double radius;
      double circumference;
      double area;
      double volume;

      System.out.println("<----------------------------------------->");
      System.out.println("       CIRCUMFERENCE, AREA & VOLUME        ");
      System.out.println("<----------------------------------------->");

      System.out.print("  Enter the Radius        : ");
      radius = scanner.nextDouble();

      circumference = 2 * Math.PI * radius;
      area = Math.PI * Math.pow(radius, 2);
      volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

      System.out.printf("  The Circumference is    : %.1fcm \n", circumference);
      System.out.printf("  The Area of circle is   : %.1fcm² \n", area);
      System.out.printf("  The Volume of circle is : %.1fcm³ \n", volume);
      // we have used "printf" for limiting the values after decimal

      
      scanner.close();


    }
}
