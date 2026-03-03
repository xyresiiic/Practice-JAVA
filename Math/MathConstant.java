public class MathConstant {
    public static void main(String[] args) {
        
        System.out.println(Math.PI); // the value of PI
        System.out.println(Math.E);  // the value of Euler's number

        double result;
        double squreRoot;
        double round;
        double ceiling;
        double floor;
        int maximum;
        int minimum;


        // Here are some constants and math methods

        result = Math.pow(2, 2); // For 2^n or more
        System.out.println("The result of 2² (2^n and more)  : " + result);

        squreRoot = Math.sqrt(25); // For printing squre roots
        System.out.println("The squre root of 25 is          : " + squreRoot);

        round = Math.round(25.6269); // For round of to nearest integer
        System.out.println("The Round value of 25.6269 is    : " +round);

        ceiling = Math.ceil(3.14); // For printing ceiling value
        System.out.println("The ceiling value of 3.14 is     : " +ceiling);

        floor = Math.floor(3.14); // For printing floor value
        System.out.println("The floor value of 3.14 is       : " +floor);

        maximum = Math.max(20, 25); // For finding maximum value 
        System.out.println("The maximum between 20 and 25 is : " + maximum);

        minimum = Math.min(20, 25); // For finding minimum value 
        System.out.println("The minimum between 20 and 25 is : " + minimum);


        
    }
}
