import java.util.Scanner;
public class EnhancedSwitchs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("<--------------------------------------->");
        System.out.print("  Eneter the Day of week : ");
        String day = scanner.next().toLowerCase();

        switch (day){

            case "monday" -> System.out.println("  Monday is a weekday");
            case "tuesday" -> System.out.println("  Tuesday is a weekday");
            case "wednesday" -> System.out.println("  Wednesday is a weekday");
            case "thursday" -> System.out.println("  Thursday is a weekday");
            case "friday" -> System.out.println("  Friday is a weekday");
            case "saturday" -> System.out.println("  Saturday is a weekend");
            case "sunday" -> System.out.println("  Sunday is a weekend");
            default -> System.out.println("  " + day + " is not a day of the week");

        }
        System.out.println("<--------------------------------------->");

        scanner.close();
        
    }
}
