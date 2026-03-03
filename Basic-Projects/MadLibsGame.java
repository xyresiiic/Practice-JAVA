
// Mad LIBS game

import java.util.Scanner;

public class MadLibsGame {

    public static void main(String[] args) {
     

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String verb1;
        String adjective2;
        String noun1;
        String adjective3;


        System.out.print("Enter an adjective (Description)       : ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter an noun (Animal or Person)       : ");
        noun1 = scanner.nextLine();

        System.out.print("Enter one more adjective (Description) : ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter an Verb ending with ing (action) : ");
        verb1 = scanner.nextLine();

        System.out.print("Enter one more adjective (Description) : ");
        adjective3 = scanner.nextLine();

        System.out.println("<--------------------------------------------------------->");
        System.out.println("Today I went to a " + adjective1 + " zoo");
        System.out.println("In a exibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was "+ adjective2 + " and "+ verb1 + " !");
        System.out.println("I was " + adjective3 + " !");

       

        scanner.close();

    }
    
}
