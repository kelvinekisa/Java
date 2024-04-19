import java.util.Scanner;

public class FuncDecomp {

    public static void main(String[] args) {
        int password = 1234;
        String speakersState = ""; // Initialize to empty string
        String lampState = ""; // Initialize to empty string
        String doorState = ""; // Initialize to empty string

        // reading the password
        System.out.println("Enter password: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        // checking whether the password is correct
        if (i != password) {
            System.out.println("Incorrect Password!");

        } else {
            // asking the user what they want to do
            System.out.println("Choose the object: 1 - Speakers, 2 - lamp, 3 - door");
            int action = scanner.nextInt(); // Use scanner.nextInt() instead of Scanner.nextInt()

            switch (action) {
                case 1:
                    // asking the user about speakers
                    switch (speakersState) {
                        case "on":
                            // Code for when speakers are on
                            break;
                        case "off":
                            // Code for when speakers are off
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    switch (lampState) {
                        case "on":
                            // Code for when lamp is on
                            break;
                        case "off":
                            // Code for when lamp is off
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    switch (doorState) {
                        case "on":
                            // Code for when door is on
                            break;
                        case "off":
                            // Code for when door is off
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
