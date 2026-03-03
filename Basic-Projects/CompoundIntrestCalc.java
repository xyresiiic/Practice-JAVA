import java.util.Scanner;
public class CompoundIntrestCalc {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double principal;
        double amount;
        double rate;
        int timesCompounded;
        int year;

        System.out.println("<---------------------------------------------------------------->");
        System.out.println("                 Compount interest calculator                     ");
        System.out.println("<---------------------------------------------------------------->");

        System.out.print("  Enter the principal ammount              : ");
        principal = scanner.nextDouble();

        System.out.print("  Enter the interest (in %)                : ");
        rate = scanner.nextDouble() / 100;

        System.out.print("  Enter Number of time compounder per year : ");
        timesCompounded = scanner.nextInt();

        System.out.print("  Enter the number of years                : ");
        year = scanner.nextInt();

    //<----------------------------- this is the formula--------------------------------->
        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * year);
    //<---------------------------------------------------------------------------------->
    
    System.out.println("<---------------------------------------------------------------->");
    System.out.println("  Your total Amount after " + year + " will be        : " + amount);
    System.out.println("<---------------------------------------------------------------->");


    

        scanner.close();
    }
}
