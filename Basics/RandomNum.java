import java.util.Random; // used to generate random number 

public class RandomNum {
    public static void main(String[] args) {
        Random random = new Random(); // object for random number

        int number;      // Generating a random number
        double number2;   // Generating a random double
        boolean isHead;   // Generating a booolean

        number = random.nextInt(5,10); // boundings for random number
        number2 = random.nextInt(1,6);
        isHead = random.nextBoolean();

        System.out.println(number);
        System.out.println(number2);
        
        if (isHead) {
            System.out.println("Heads");
        }
        else{
            System.out.print("Tails");
        }
    }
}
