public class Ternary {

    public static void main(String[] args) {
        
        /*
         * evaluates a condition and chooses of 
         * two cases to execute.
         */
        int a = 2;
        int b = 10;

        int max = 100;

        if (a > b){
            max = a;
        }else{
            max = b;
        }
        // exquivalent ternary operator
        // int max = a > b ? a : b;

        //The general syntax of the ternary operator is:
        //result = condition ? truecase : elsecase
        // the condition is a boolean expression that evaluates to either true or false
        //if the expression is true the ternary operator evaluates truecase
        // otherwise the elsecase is evaluated

        // Example
        int num = 10; // initialized by a value
        System.out.println(num % 2 == 0 ? "even" : "odd");

        /*
         * nesting one ternary operator into another one
         * but it can be less readable if not 
         */

         // Increment and Decrement
         /*
          * used to increment a variable by one

          Using ++ and -- in java

          */

          int n = 10;

          n++; //11
          System.out.println("This is the increment " + n);
          n--; //10

          System.out.println("this is the decrement value: " + n);

          // Prefix and postfix forms
        /*
         * The prefix form (++n or --n) increases or decreases the value of a variable before it is used
         * The postfix form (n++ or n--) increases or decreases the value of a variable after it is used
         * 
         */
        int y = 4;
        int x = ++a;
        System.out.println(y);
        System.out.println("Prefix" + x);
    }

}