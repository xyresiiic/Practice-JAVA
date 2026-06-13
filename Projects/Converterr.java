import java.util.Scanner;

class Converter{
    int option;
    int suboption;
    double amount;
    double time;
    double distance;
}

public class Converterr {

    static Scanner sc = new Scanner(System.in);

    // ---------------- Currency Converter ----------------
    static void currency() {
        Converter s1 = new Converter();

        System.out.println("<----------------- Currency Converter -------------------->\n");
        System.out.println("1. INR to USD");
        System.out.println("2. INR to EURO");
        System.out.println("3. INR to YEN");
        System.out.println("4. YEN to INR");
        System.out.println("5. EURO to INR");
        System.out.println("6. USD to INR\n");

        System.out.print("Enter your option --> ");
        s1.suboption = sc.nextInt();

        switch (s1.suboption) 
        {
            case 1:
                System.out.print("Enter Amount in INR --> ");
                s1.amount = sc.nextDouble();
                System.out.println(s1.amount + " INR = " + (s1.amount * 0.01142) + " USD");
                break;

            case 2:
                System.out.print("Enter Amount in INR --> ");
                s1.amount = sc.nextDouble();
                System.out.println(s1.amount + " INR = " + (s1.amount * 0.00980) + " EURO");
                break;

            case 3:
                System.out.print("Enter Amount in INR --> ");
                s1.amount = sc.nextDouble();
                System.out.println(s1.amount + " INR = " + (s1.amount * 1.72) + " YEN");
                break;

            case 4:
                System.out.print("Enter Amount in YEN --> ");
                s1.amount = sc.nextDouble();
                System.out.println(s1.amount + " YEN = " + (s1.amount * 0.595) + " INR");
                break;

            case 5:
                System.out.print("Enter Amount in EURO --> ");
                s1.amount = sc.nextDouble();
                System.out.println(s1.amount + " EURO = " + (s1.amount * 102) + " INR");
                break;

            case 6:
                System.out.print("Enter Amount in USD --> ");
                s1.amount = sc.nextDouble();
                System.out.println(s1.amount + " USD = " + (s1.amount * 87.6) + " INR");
                break;

            default:
                System.out.println("Invalid input !!!");
        }
    }

    // ---------------- Time Converter ----------------
    static void timeConverter() {
        Converter s1 = new Converter();

        System.out.println("<----------------- Time Converter -------------------->\n");
        System.out.println("1. Minute to Second");
        System.out.println("2. Minute to Hour");
        System.out.println("3. Hour to Second");
        System.out.println("4. Hour to Minute");
        System.out.println("5. Second to Hour");
        System.out.println("6. Second to Minute\n");

        System.out.print("Enter your option --> ");
        s1.suboption = sc.nextInt();

        switch (s1.suboption) 
        {
            case 1:
                System.out.print("Enter Time in Minute --> ");
                s1.time = sc.nextDouble();
                System.out.println(s1.time + " Minutes = " + (s1.time * 60) + " Seconds");
                break;

            case 2:
                System.out.print("Enter Time in Minute --> ");
                s1.time = sc.nextDouble();
                System.out.println(s1.time + " Minutes = " + (s1.time / 60) + " Hours");
                break;

            case 3:
                System.out.print("Enter Time in Hour --> ");
                s1.time = sc.nextDouble();
                System.out.println(s1.time + " Hours = " + (s1.time * 3600) + " Seconds");
                break;

            case 4:
                System.out.print("Enter Time in Hour --> ");
                s1.time = sc.nextDouble();
                System.out.println(s1.time + " Hours = " + (s1.time * 60) + " Minutes");
                break;

            case 5:
                System.out.print("Enter Time in Second --> ");
                s1.time = sc.nextDouble();
                System.out.println(s1.time + " Seconds = " + (s1.time / 3600) + " Hours");
                break;

            case 6:
                System.out.print("Enter Time in Second --> ");
                s1.time = sc.nextDouble();
                System.out.println(s1.time + " Seconds = " + (s1.time / 60) + " Minutes");
                break;

            default:
                System.out.println("Invalid input !!!");
        }
    }

    // ---------------- Distance Converter ----------------
    static void distance() {
        Converter s1 = new Converter();

        System.out.println("<----------------- Distance Converter -------------------->\n");
        System.out.println("1. Meter to Kilometer");
        System.out.println("2. Meter to Miles");
        System.out.println("3. Kilometer to Meter");
        System.out.println("4. Kilometer to Miles");
        System.out.println("5. Miles to Meter");
        System.out.println("6. Miles to Kilometer\n");

        System.out.print("Enter your option --> ");
        s1.suboption = sc.nextInt();

        switch (s1.suboption) 
        {
            case 1:
                System.out.print("Enter Distance in Meter --> ");
                s1.distance = sc.nextDouble();
                System.out.println(s1.distance + " Meter = " + (s1.distance * 0.001) + " Kilometer");
                break;

            case 2:
                System.out.print("Enter Distance in Meter --> ");
                s1.distance = sc.nextDouble();
                System.out.println(s1.distance + " Meter = " + (s1.distance * 0.000621) + " Miles");
                break;

            case 3:
                System.out.print("Enter Distance in Kilometer --> ");
                s1.distance = sc.nextDouble();
                System.out.println(s1.distance + " Kilometer = " + (s1.distance * 1000) + " Meter");
                break;

            case 4:
                System.out.print("Enter Distance in Kilometer --> ");
                s1.distance = sc.nextDouble();
                System.out.println(s1.distance + " Kilometer = " + (s1.distance * 0.621) + " Miles");
                break;

            case 5:
                System.out.print("Enter Distance in Miles --> ");
                s1.distance = sc.nextDouble();
                System.out.println(s1.distance + " Miles = " + (s1.distance * 1609.344) + " Meter");
                break;

            case 6:
                System.out.print("Enter Distance in Miles --> ");
                s1.distance = sc.nextDouble();
                System.out.println(s1.distance + " Miles = " + (s1.distance * 1.609) + " Kilometer");
                break;

            default:
                System.out.println("Invalid input !!!");
        }
    }

    // ---------------- Main Method ----------------
    public static void main(String[] args) {
        Converter s1 = new Converter();

        System.out.println("<------------------ C O N V E R T E R --------------------->\n");
        System.out.println("1. Currency Converter");
        System.out.println("2. Time Converter");
        System.out.println("3. Distance Converter\n");

        System.out.print("Enter your option --> ");
        s1.option = sc.nextInt();

        switch (s1.option) 
        {
            case 1:
                currency();
                break;
            case 2:
                timeConverter();
                break;
            case 3:
                distance();
                break;
            default:
                System.out.println("Invalid input !!!");
        }
    }
}