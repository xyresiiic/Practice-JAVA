public class TernaryOperator{
    public static void main(String[] args) {

        // ternary operator (?) --> return one of two values if condition is true 
        // variable = (condition) ? --> ifTrue : ifFalse;

        int marks = 40;
        int number = 3;

        String passOrFail = (marks>36) ? "Pass" : "Fail" ; // ternary operator (?) used to check
        System.out.println(passOrFail);

        String evenOrOdd = (number%2 == 0) ? "Even" : "Odd" ;
        System.out.println(evenOrOdd);

    }
}