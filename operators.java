import java.util.Scanner;

public class operators {
    
    public static void main(String[] args) {
        // Relational operators in java are used fo comparing values
        // help determining relationships between variables, such as checking if one value is greater than another or if two values are equal.
        // Operators are essential for making decisions
        // and controlling the flow program flow based on specific conditions
        /*
         * == (equal to)
         * != (not qual to)
         * > (greater than)
         * >= (greater than or equal to)
         * < (less than)
         * <= (less than or equal to)
         * 
         */
        // int one = 1;
        // int two = 2;
        // int three = 3;
        // int four = 4;

        // boolean z = one == one; // true
        // boolean grat = two > one;
        // boolean les = three < four;

        // System.out.println(z);
        // System.out.println(grat);
        // System.out.println(les);

        // Scanner scanner = new Scanner(System.in);
        // int h1 = scanner.nextInt();
        // int h2 = scanner.nextInt();
        // int h3 = scanner.nextInt();

        // boolean descOrdered = (h1 >= h2) && (h2 >= h3);
        // System.out.println(descOrdered);

        // Conditional Statements
        /*
         * Programming construct that allows a program to make a decision
         * based on the whether a certain condition is true or false
         * It enables the program to execute different blocks of code 
         * depending on the outcome of the condition. The basic 
         * structure of a conditional statement in Java is an 
         * if keyword followed by a boolean expression in 
         * parentheses, and a body enclosed in curly braces. 
         * If the expression is true, the code inside the curly 
         * braces is executed, otherwise, it is skipped.
         */

         // the single if-case
         //if (expression){
            //body: do smmething
        //  } if the condition is true the statements inside
        // the block are executed, otherwise the program skips them.
        int age = 78;

        if (age > 70){
            System.out.println("Very Experienced Person");
        }
    // The if-else-cases
    /*
     * The if-case can be extended with the keyword else
     * and another body to do alternative actions when the 
     * expressions is false
     */
    int num = 45;

    if (num > 18){
        System.out.println("You are eligible to vote");

    }else{
        System.out.println("You are not eligible to vote");
    }
    /*
     * if the expression is true, then the firsdt code block is 
     * executed; otherwise, the second code block is executed, but not 
     * both together.
     */
    int x = 20; // x is initialization

    if (x % 2 == 0) {
        System.out.println("It's an even number");
        }else{
            System.out.println("It's and odd number");
        }

    // The if-else-if-cases
    //The most general form of the conditional statement consists
    // of several conditions and else-if-branches
    
    long Dollars = 1000L;

    if (Dollars < 1000){
        System.out.println("Buy a laptop");

    }else if (Dollars < 2000){
        System.out.println("Buy a personal car");
    }else if (Dollars < 100_000){
        System.out.println("Buy a server");
    }else{
        System.out.println("Buy a data Center");
    }    


    }
}
