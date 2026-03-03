public class Printf {
    public static void main(String[] args) {
        
    // Printf() --> method used to formate output
    // %[flag][width][.precision][specifier-character]


    //specifier-character

    /*
       %s = for string
       %f = for double
       %d = for integers
       % b = for boolean
       %c = for characters
    */

    String name ="Veer";
    char firstLetter = 'V';
    double height = 5.8;
    int age = 19;
    boolean isStudent = true;

    System.out.println("-------------------------------------------");

    System.out.printf("Hello My name is          :  %s\n", name);
    System.out.printf("First latter of my name is: %c\n", firstLetter);
    System.out.printf("My height is              : %.1f\n", height);
    System.out.printf("I age is                  : %d\n", age);
    System.out.printf("Am I a student            : %b\n", isStudent);
    System.out.printf("%s is %d years old\n", name, age);

    System.out.println("-------------------------------------------");
    System.out.println("                Precision                  ");
    System.out.println("-------------------------------------------");

    // .precision
    
    double price1 = 10015200.555;
    double price2 = 29851.356;
    double price3 = -123000.14;

    System.out.printf("%f\n", price1);    // %f display 7 digits after decimal
    System.out.printf("%.1f\n", price2);  // %.1f display 1 digits after decimal
    System.out.printf("%.2f\n", price3);  // %.2f display 2 digits after decimal


    // Flags

    /*

       + = output a plus
       , = comma grouping seprator
       ( = negative numbers are enclosed()
       space = display a minus if negative, space if positive

     */
    System.out.println("-------------------------------------------");
    System.out.println("                  Flags                    "); 
    System.out.println("-------------------------------------------");
   
    System.out.printf("%+f\n", price1);    // "%+f" for the positive numbers
    System.out.printf("%+1f\n", price2);  
    System.out.printf("%+2f\n", price3);  

    System.out.println("-------------------------------------------");
    System.out.println("               [ , ] Flag                  ");
    System.out.println("-------------------------------------------");
   
    System.out.printf("%,f\n", price1);    // "%,f" for grouping or seprating
    System.out.printf("%,1f\n", price2);  
    System.out.printf("%,2f\n", price3);  

    System.out.println("-------------------------------------------");
    System.out.println("               [ ( ] Flag                  ");
    System.out.println("-------------------------------------------");
   
    System.out.printf("%(f\n", price1);    // "%(f" from this negative numbers are enclosed in ()
    System.out.printf("%(1f\n", price2);  
    System.out.printf("%(2f\n", price3);  

    System.out.println("-------------------------------------------");
    System.out.println("            [ space ] Flag                 ");
    System.out.println("-------------------------------------------");
   
    System.out.printf("% f\n", price1);    // "% f" display a minus if negative, space if positive
    System.out.printf("% 1f\n", price2);  
    System.out.printf("% 2f\n", price3);  


    // width

    /*
      0 = zero padding
      positive number = right justified padding
      negative number = left justified padding
    */


    int id1 = 2;
    int id2 = 25;
    int id3 = 434;
    int id4 = 1254;
   
    System.out.println("-------------------------------------------");
    System.out.println("               Zero Padding                ");
    System.out.println("-------------------------------------------");
   
    System.out.printf("%04d\n", id1);    // "0" for padding zero and "4" for 4 digit padding 
    System.out.printf("%04d\n", id2);  
    System.out.printf("%04d\n", id3); 
    System.out.printf("%04d\n", id4);  

    System.out.println("-------------------------------------------");
    System.out.println("              Num Padding                   ");
    System.out.println("-------------------------------------------");
   
    System.out.printf("%4d\n", id1);    // "4" for 4 digit(space) padding 
    System.out.printf("%4d\n", id2);  
    System.out.printf("%4d\n", id3); 
    System.out.printf("%4d\n", id4);  

    System.out.println("-------------------------------------------");
    System.out.println("          Negative num Padding             ");
    System.out.println("-------------------------------------------");
   
    System.out.printf("%-2d\n", id1);    // "0" for padding zero and "4" for 4 digit padding 
    System.out.printf("%-2d\n", id2);  
    System.out.printf("%-2d\n", id3); 
    System.out.printf("%-2d\n", id4);  

    System.out.println("-------------------------------------------");


    }
}
