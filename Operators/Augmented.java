
public class Augmented {
    public static void main(String[] args) {

     /*
     Augmented assignment operators
    
          =
          +=
          -=
          *=
          /=
          %=
    */
   

      int x=10;
      int y=2;
     

      x += y;  // to add x and y
      System.out.println("Addition is       :" + x );

      x -= y;  // sub y from x
      System.out.println("Subtraction is    :" + x );

      x *= y;  // Multiply x and y
      System.out.println("Multiplication is :" + x );

      x /= y;  // Divide x by y
      System.out.println("Division is       :" + x );

      x %= y;  // mod x of y
      System.out.println("Modules is        :" + x );

       x = y;  // to assign value of x to y
      System.out.println("Value is          :" + x );

    }
    
}
