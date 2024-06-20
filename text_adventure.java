// Import the Scanner class, which is used for taking user input
import java.util.Scanner;

// Create class for confirming user input
public class Confirm {
    // We will use two strings for confirming user input
    private String isCorrect;
    private String okay;
    
    // Define constructor
    public Confirm(String isCorrect, String okay) {
        // Using 'this' ensures the variables/fields will be specific to the object instance
	this.isCorrect = isCorrect;
	this.okay = okay;
    }
	
    // Define method
    public static boolean getConfirmation(String isCorrect, String okay) {
        // Create new Scanner object // 'System.in' 
        Scanner scanner = new Scanner(System.in);
	// This string that will store the user's answer
	String answer;
        // Print your message that prompts the user
	System.out.println(isCorrect + "[Y/n]");
	// Read user input and assign to variable // trim() excises extraneous input text
	answer = scanner.nextLine().trim()
	// If user entered 'Y' or 'y'...
	if (answer.equalsIgnoreCase("y")) {
	    // ...print the confirmation of the input
	    System.out.println(okay);
	} // Else, if the user entered 'N' or 'n'...
	else if (answer.equalsIgnoreCase("n")) {
	    
	}
    }
	    
}

// Contains methods and attributes pertaining to character traits
public class CreateCharacter {
    // Define method that creates Scanner object
    public void() {
    // 'System.in' 
    Scanner scanner = new Scanner(System.in);
    }
    
    // Method for receiving character name from user
    public String getName() {
        // Unlike 'println', 'print' leaves cursor on same line
        System.out.print("Please enter your character's name: ");
        // 'nextLine()' 
        String name = scanner.nextLine();
	
	// Call constructor for Confirm class
	//Confirm confirmName = new Confirm("You have entered "+name+", is this correct? [Y/n]", "Okay, your character's name is "+name+".");
	//
                }
        
    }
}

// Define main class
public static void main(String[] args) {

}


// DEAD CODE

/* I think I can just use the built-in boolean method for this
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
*/

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
