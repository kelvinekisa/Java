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
    public static void main(String[] args) {
        myMethod("Kelvin");
        Area(10, 30);
        System.out.println(BMI(21, 12));
        int total = cost(200, 05);
        System.out.println(total);
        checkage(12);
        
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
         */
        
    }
    
}
