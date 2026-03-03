
// To calculate area of a rectangle

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        
        double length = 0;
        double width = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("<---------area of Rectangle----------> ");
    

        System.out.print("Enter Length of the Rectangle: ");
        length = scanner.nextDouble();

        System.out.print("Enter Width of the Rectangle: ");
        width = scanner.nextDouble();

        area = length * width;
        System.out.print("The area of the rectangle is : " + area + " cm²");

        scanner.close();
    }
    
}
