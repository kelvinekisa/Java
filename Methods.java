public class Methods {

    static void myMethod(String fname) {
        System.out.println(fname + " Ekisa");
        System.out.println("I just got executed!");


    }
    static void Area(int l, int w) {
        int Area;
        Area = l * w;
        System.out.println("The area of a rectangle is: " + Area);

    }
    // Using the return keyword
    static float BMI(float h, float w) {
        
        return ((w * w) / h);

    }
    //you can also store results in a variable

    static int cost(int price, int qty) {
        return price * qty;
    }


    // A method with if...Else
    //create a chackage() method with an integer variable called age
    static void checkage(int age) {
        //if age is less than 18 print access denied
        if (age < 18) {
            System.out.println("Access Denied - You are not old enough");
        }else {System.out.println("Access granted - you ae old enough");}
    }

    //calculate volume of a cuboid
    static void calculateVolume(int length, int width,int height ) {
        int volume = length * width * height;
        System.out.println("The volume of a box is equal to: " + volume);

    }

    //invoking a method with different parameters



    static void printStudent(String name, double averagescore) {
        System.out.println("Name: " + name);
        System.out.println("Average Score: " + averagescore);
    }
    public static void main(String[] args) {
        myMethod("Kelvin");
        Area(10, 30);
        System.out.println(BMI(21, 12));
        int total = cost(200, 05);
        System.out.println(total);
        checkage(12);
        calculateVolume(12, 12, 12);
        

        // calling  function with correct parametrs
        printStudent("Kelvin Ekisa", 364);
        /*
         * A method is a sequence of statements that can be invoked or reffered to by it's name
         * Parameters a value used inside a method
         * parameters acts as variables inside the method
         * they are specified after the method name, inside the aprenthesis
         * when a parameter is passed to the method, it is called an argument
         * fname - parameter while Kelvin is an argument
         * 
         * 
         * 
         * The VOID keyword used indicates that the method should not return a value
         * if you want the methpod to return a value you should use primitive datatypes such as int, char
         * and use the return keyword inside the method
         * 
         * when calling a function you should always provide the correct number and types or arguments that the function expects
         * 
         * 
         * Not all methods expect any parameters; some are designed to operate without any provided data
         */

// Declaring methods
        /*
         * Access modifiers
          non access modifiers

          access modifiers define the  visibility of the method
          public means there are no restrictions for invoking the method from anywhere

          non acess modifiers provide information about the  behaviour of methods to JVM
          the modifier static means that the method belongs to the class and it can be accessed without creating any object.
          its called a static method

          if a method is declared without the static modifier, i means that the method can e invoked only through or with an obkect or instance of this class. instance methods


          method parameters
          we define, the type, number, and order of the parameters
          
         */
        
    }
    
}
