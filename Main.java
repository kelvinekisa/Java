import java.util.Scanner;


// Arithmetic operations
public class Main {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // String name = scanner.nextLine();
        // System.out.println("Hello, " + name + "!");

    //     System.out.println(13 + 20);
    //     System.out.println(20 + 70);

    //     System.out.println(70 - 30);
    //     System.out.println(30 - 70);

    //     System.out.println(21 * 30);

    //     /*
    //      * The / operator returns the integer part of the division of two integer numbers
    //      * any fractional part is discarded
    //      * 
    //      * The % is the modulus or remainder operator
    //      * it returns the remainder of the division of two numbers
    //      * 
    //      */
    //     System.out.println(8 / 3);
    //     System.out.println(41 / 5);

    //     System.out.println(8 / 3);

    //     // writing complex expressions
    //     System.out.println(1 + 3 * 4 - 2); //to specify the order of execution we can use.

    //     // Unary operators
    //     // The unary plus operator indicates a positive value
    //     System.out.println(-8); // prints -8
    //     System.out.println(-(100 + 4)); // prints -104

    // // int types and operations
    // int two = 2;
    // int ten = 10;
    // int twelve = two + ten;
    // int eight = ten - two;
    // int five = ten / two;
    // int zero = ten % two;
    
    // int nimusTwo =-two;
    // System.out.println(twelve);
    // System.out.println(eight);
    // System.out.println(five);
    // System.out.println(zero);
    // System.out.println(nimusTwo);

    // // reading numbers from a standard input
    // Scanner scanner = new Scanner(System.in);
    //  int a = scanner.nextInt();
    //  int b = scanner.nextInt();

    //  int sum = a + b;

    //  System.out.println("The sum is: " + sum);

    //  //Boolean type and operations. true and false
    //  boolean open = true;
    //  boolean closed = false;

    //  System.out.println(open);
    //  System.out.println(closed);

//Logical Operators
/*
 * Variables of the boolean type are often used to build logical expressions using logical operators. Java has four logical operators NOT, AND, OR and XOR:
 * NOT - unary operator that reverses the boolean value
 * AND - binary operator that returns true if both operands are true, otherwise returns false
 * denoted as &&
 * 
 * OR - binary operator that returns true if atleast one operand is true
 * denoted as ||
 * 
 */
        boolean f = false; // f is false
        boolean t = !f; //t is true

        System.out.println(f);
        System.out.println(t);

        boolean b1 = false && false;
        boolean b2 = false && true;
        boolean b3 = true && false;
        boolean b4 = true && true;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

     // OR
     boolean v1 = false || false;
     boolean v2 = false || true;
     boolean v3 = true || false;
     boolean v4 = true || true;

     System.out.println(v1);
     System.out.println(v2);
     System.out.println(v3);
     System.out.println(v4);

     // XOR(Exclusive OR) binary operator that returns true
     // if boolean operands have different values, otherwise it returns false.
     // denoted as ^
     boolean c1 = false ^ false;
     boolean c2 = false ^ true;
     boolean c3 = true ^ false;
     boolean c4 = true ^ true;

     System.out.println(c1);
     System.out.println(c2);
     System.out.println(c3);
     System.out.println(c4);

     // The precedence of logical operators
     
    }
}