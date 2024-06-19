// Import the Scanner class, which is used for taking user input
import java.util.Scanner;

// Define class for confirming user input
public class Confirm {
    // Create the strings we'll use
    private String isCorrect;
    private String okay;

    // Constructor
    public Confirm(String isCorrect, String okay) {
        this.isCorrect = isCorrect;
        this.okay = okay;
    }
}

/* I think the below code block can be in my Confirm class
 *
// Confirm name entered is correct
        System.out.println("You have entered " + name + ", is this correct? [Y/n]");
        // 'charAt(0)' reads only the first character entered
        char confirm = scanner.next().charAt(0);
        // Convert user input to lower-case to control for irregular input
        lowerConfirm = confirm.toLowerCase();
        // 
        if (lowerConfirm == 'y') {
            System.out.println("Okay, your character's name is " + name ".");
*/

// Contains methods and attributes pertaining to character traits
public class CreateCharacter {
    // Define class that creates Scanner object
    public void() {
    // Create Scanner object
    Scanner scanner = new Scanner(System.in);
    }
    
    // Method for receiving character name from user
    public String getName() {
        // Unlike 'println', 'print' leaves cursor on same line
        System.out.print("Please enter your character's name: ");
        // 'nextLine()' 
        String name = scanner.nextLine();
	// Call constructor for Confirm class
	Confirm confirmName = new Confirm("You have entered "+name+", is this correct? [Y/n]", "Okay, your character's name is "+name+".");
	//
                }
        
    }
}

// Define main class
public static void main(String[] args) {

}
