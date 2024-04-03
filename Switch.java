import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //The swiych statement dealing with multiple choices
        //suppose you need to write a program that performs different actions depending on the values of a variable
        int action = 4;

        if (action == 1) {
            System.out.println("Startning a new game");
        }else if (action == 2) {
            System.out.println("Loading a saved game");

        }else if (action == 3) {
            System.out.println("Displaying help");

        }else if (action == 4) {
            System.out.println("Exiting");
        }else{
            System.out.println("Unsuitable action please try again");
        }
        //Three keywords: Switch, case and default
        /*
         * The switch statement provides a way to choose between multiple cases
         * based on the vale of a single variable i.e int, char, str or enumeration
         */

         // Switch
         Scanner scanner = new Scanner(System.in);
         int choice = scanner.nextInt();
         switch (choice) {
           
            case 1:
                System.out.println("Starting a new game");
                
                break;
            case 2:
                System.out.println("Loading a saved game");
                break;
            case 3:
                System.out.println("Dispalying help");
                break;
            case 4:
                System.out.println("Exiting");
         
            default:
                System.out.println("Unsuitable action please try again");
         }
         /*
          * The switcha nd case keywords are always required here.
          the break and default are optional
          */

          //Data types and their sizes
          /*
           * Primitive data types -Numbers
           * long
           * int 
           * short
           * byte
           * 
           * double
           *  
           */

           // Type casting
           //implicit and explicit type casting
         int num = 100;
         long bigNum = num;

         
    }
    
}
