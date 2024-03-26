import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        // Te while loop
        /*
         * if the condition is true, the code within the block is executed.
         * this code repeats until te condition becomes false
         * since the loop checks the conditions before the block is excecuted - pre-test loop
         * 
         * The basic syntax of the while loop:
         * while (condition){
         * //body: do something repetative
         * }
         */

     
        // Example: print integer numbers while avariable is less than 5
        int i = 0;
        while (i < 5){
            System.out.println(i);
            i++;
        }
        //program to display english letters in a single line.
        char letter = 'A';

        while (letter <= 'Z'){
            System.out.println(letter);
            letter++;
        }
        // The do while loop
        /*
         * The body is executed first, while the condition is tested afterwards
         * if the condition is true, statements within the block are executed again.
         * This repeats until the condition becomes false.
         * 
         * do {
         * //body : do something
         * }while(condition)
         */
        Scanner scanner = new Scanner(System.in);

        int value;
        do {
            value = scanner.nextInt();
            System.out.println(value);

        }while (value != 0);
        
        //reading a sequence with an unknown length
        /*
         * we invoke the hasNextInt() method of scanner inside
         * the condition
         * the method returns true if the next
         */

    }
    
}
