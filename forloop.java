public class forloop {

    public static void main(String[] args) {
        /*
         * often used to iterate over a arange of values or through an array
         * if the numbers of iterations or the range borders are known it is recommended to use the for loop
         * if they are unknown the while lop is preferable
         * 
         * for (initialization; condition, modification){
         * 
         *  // do something
         * }
         * initialization statement - is executed once before the loop begins; loop variable are initialized here
         * condition - boolean expression that determines the need for the next iteration, if it's false the loop terminates
         * modification - statement that changes the value of the loop variables
         * it is invoked after each iteration of the loop, ussually it uses increment or decrement to modify the loop's variable
         * 
         *
         * 
         *
         * 
         * 
         */

         int n = 9;
         for (int i = 0; i <= n; i++){
            System.out.print(i + " ");
        }
        // let's calculate the sum of the integer numbers from 1 to 10
        int startInc = 1, endExcl = 11;

        int sum = 0;
        for (int i = startInc; i < endExcl; i++){
            sum += i;;
        }
        System.out.println(sum);

        // skiping parts
        /*
         * The initialization statement, the condition and the modification parts are optional, the for loop might not have all this.
         * 
         */
        // int i = 10;

        // for (; i > 0; i--){
        //     System.out.println(i + " ");
        // }
        // // it's possible to write an infinite loop without these parts at all:
        // for (;;) {
        //     // do something
        // }

        // Nested lops
        /*
         * this process produces a multidimensional structure like tables(matrices), data cubes
         * 
         */
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++){
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
        // break and continue statements. branching
        /*
         * you may want to alter the standard behavior of a loop. Branching statements for this purpose tht can terminate a loop or skip some of it's iterations
         * 
         * 
         * The break Statement
         * terminates the current loop of any type
         * terminates a case in the switch statement
         */
        int m = 10;
        while (true) {
            if (m == 0){
                break;
            }
            m--;
        }
        // print a ladder of numbers
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(j + " ");
                if (i == j) {
                    break;
                }
            }
            System.out.println();
        }
    }
    
}
