import java.util.Scanner;

public class ShoopingCart {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        double total;

        System.out.print("Enter the Item     : ");
        item = scanner.nextLine();
        System.out.print("Enter the Price    : ");
        price = scanner.nextDouble();
        System.out.print("Enter the Quantity : ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("<------------------------------->");
        System.out.println("             Recipt              ");
        System.out.println("<------------------------------->");

        System.out.println("  Item selected  : " + item);
        System.out.println("  Price per unit : " + price);
        System.out.println("  Quantity       : " + quantity);
        System.out.println("  Total          : " + total);



        scanner.close();

    }
}
