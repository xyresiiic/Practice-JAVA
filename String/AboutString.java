import java.util.Scanner;

public class AboutString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.err.println("<------------------------------------------------------------------->");
        System.err.println("                        length of string                             ");
        System.err.println("<------------------------------------------------------------------->");
        String name;
        System.out.print("  Enter the string to find out its length      : ");
        name = scanner.nextLine();
        int length = name.length();  // funtion for determining the length of string
        System.out.println("  Length of  the string is : " + length);


        System.err.println("<------------------------------------------------------------------->");
        System.err.println("                           Find letter                               ");
        System.err.println("<------------------------------------------------------------------->");
        int place;
        System.out.print("  Enter the index where you want to find letter : ");
        place = scanner.nextInt();
        char letter = name.charAt(place); // funtion to find out leeter at a index
        System.out.println("  Letter at " + place + " is " + letter);
        scanner.nextLine();


        System.err.println("<------------------------------------------------------------------->");
        System.err.println("                            Find index                               ");
        System.err.println("<------------------------------------------------------------------->");
        String find;
        System.out.print("  Enter the letter who's you want to find index  : ");
        find = scanner.nextLine();
        int index = name.indexOf(find); // funtion to find the first index of desired letter
        int lastIndex = name.lastIndexOf(find); // funtion to find the last index of desired letter
        System.out.println("  First Index of " + find +  " is " + index); 
        System.out.println("  Last Index of " + find +  " is " + lastIndex); 
        


        System.err.println("<------------------------------------------------------------------->");
        System.err.println("                        Upper & Lower case                           ");
        System.err.println("<------------------------------------------------------------------->");
        name = name.toUpperCase(); // to convert string in upper case
        System.out.println("  The Upper case of string : " + name);
        name = name.toLowerCase(); // to convert string in lower case
        System.out.println("  The Lower case of string : " + name);


        System.err.println("<------------------------------------------------------------------->");
        System.err.println("                      Trim the blank spaces                          ");
        System.err.println("<------------------------------------------------------------------->");
        name = name.trim(); // to trim any blank spaces in start or end of the string
        System.out.println("  String after triming spaces : " + name);


        System.err.println("<------------------------------------------------------------------->");
        System.err.println("                         Replace Character                           ");
        System.err.println("<------------------------------------------------------------------->");
        String Pre;
        String New;
        System.out.print("  Enter the letter you want to replace : ");
        Pre = scanner.nextLine(); // the character we want to replace
        System.out.print("  Enter the letter you want to replace with : ");
        New = scanner.nextLine(); // the character we want to replace with
        name = name.replace(Pre, New); // to replace any character with other
        System.out.println("  The new string after replacing is : " + name);


        System.err.println("<------------------------------------------------------------------->");
        System.err.println("                   to check if string is empty                       ");
        System.err.println("<------------------------------------------------------------------->");
        // name.isEmpty() ----> to tcheck if string is empty
        System.out.println("  String is empty (true/false) : " + name.isEmpty());

        
        System.err.println("<------------------------------------------------------------------->");
        System.err.println("                 If string contains any character                    ");
        System.err.println("<------------------------------------------------------------------->");
        String character;
        System.out.print("  Enter the character you want to chaeck : ");
        character = scanner.nextLine(); // the character we want to check
        name.contains(character); // to check if string containes any character
        if (name.contains(character)) {
            System.out.println("  Yes the string contains : "  + character);
        }
        else{
            System.out.println("  No the string do not contains : "  + character);
        }


        System.err.println("<------------------------------------------------------------------->");
        System.err.println("                To check if two strings are equal                    ");
        System.err.println("<------------------------------------------------------------------->");
        String Secondname;
        System.out.print("  Enter the second string : ");
        Secondname = scanner.nextLine();
        // name.equals() ----> to check if strings are equal but it is case sensitive
        //name.equalsIgnoreCase() ----> this is not case sensitive 
        if (name.equalsIgnoreCase(Secondname)) {
            System.out.println("  Yes both strings are equal");   
        }
        else{
            System.out.println("  No they are not equal");
        }


       scanner.close();

    }
}
