// Import the Scanner class, which is used for taking user input
import java.util.Scanner;


// Contains methods and attributes pertaining to character traits
public class CreateCharacter {
    // Define class that creates Scanner object
    public void() {
    // Create Scanner object
    Scanner scanner = new Scanner(System.in);
    }
    // Receive character name from user
    public String getName() {
        // Unlike 'println', 'print' leaves cursor on same line
        System.out.print("Please enter your character's name: ");
        // 'nextLine()' 
        String name = scanner.nextLine();
        // Confirm name entered is correct
        System.out.println("You have entered " + name + ", is this correct? [Y/n]");
        // 'charAt(0)' reads only the first character entered
        char confirm = scanner.next().charAt(0);
    }
}

// Define main class
public static void main(String[] args) {

}
