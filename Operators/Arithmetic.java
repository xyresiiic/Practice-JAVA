
// Arithmetic Operators


public class Arithmetic {
  
   public static void main(String[] var0) {

      /*
     Arithmetic operators
    
          +
          -
          *
          /
          %

          ORDER OF OPERATIONS [ Bracket-Expo-Multiply-Divide-Add-Sub ]
    */

      int x=10;
      int y=2;
      int add;
      int sub;
      int multi;
      int div;
      int mod;

      add = x + y;  // add operator
      System.out.println("Addition is       :" + add );

      sub = x - y;  // Sub operator
      System.out.println("Subtraction is    :" + sub );

      multi = x * y;  // Multiply operator
      System.out.println("Multiplication is :" + multi );

      div = x / y;  // Divide operator
      System.out.println("Division is       :" + div );

      mod = x % y;  // mod operator
      System.out.println("Modules is        :" + mod );
      

   }
}
