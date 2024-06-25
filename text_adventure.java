// Import the Scanner class, which is used for taking user input
import java.util.Scanner;

// Create class for confirming user input
public class InputAndConfirm {
    
    // We will use three strings for confirming user input
    // "Please enter blah blah"
    private String pleaseEnter;
    // "You have entered blah blah, is this correct?"
    private String isCorrect;
    // "Okay, you have entered blah blah"
    private String okay;
    
    // Define constructor
    public InputAndConfirm(String pleaseEnter, String isCorrect, String okay) {
        // Using 'this' ensures the variables/fields will be specific to the object instance
	this.pleaseEnter = pleaseEnter;
	this.isCorrect = isCorrect;
	this.okay = okay;
    }

    // Define method for getting user input
    public static String getInput(String pleaseEnter) {
	// Create new Scanner object // 'System.in'
        Scanner scanner = new Scanner(System.in);
	// Print your message that prompts the user
	System.out.println(pleaseEnter);
	// This string will store the user input, which we receive with scanner
	String input = scanner.nextLine();
	return input;
    }

    // Define method for confirming user input
    public static boolean getConfirmation(String isCorrect, String okay) {
        // Create new Scanner object // 'System.in' 
        Scanner scanner = new Scanner(System.in);
        // Print your message that prompts the user
	System.out.println(isCorrect + " [Y/n] ");
	// Read user input and assign to variable // trim() excises extraneous input text
	String yesOrNo = scanner.nextLine().trim();
	// If user entered 'Y' or 'y'...
	if (yesOrNo.equalsIgnoreCase("y")) {
	    // ...print the confirmation of the input
	    System.out.println(okay);
	    return
	// Else, if the user entered 'N' or 'n'...
	} else if (yesOrNo.equalsIgnoreCase("n")) {
	    // Call function recursively until user enters correct string
	    getConfirmation(isCorrect, okay);
	} else {
	    System.out.println("Sorry, that input isn't valid. Please try again.");
	    getConfirmation(isCorrect, okay);
	}
    }
	    
}

// Contains methods and attributes pertaining to character traits
public class CreateCharacter {
	
    // Method for receiving character name from user
    public String getName() {
	// Define our three strings for this method
	String enterName = "Please enter your character's name: ";
	String correctName = "You have entered "+name+" for your character's name, is this correct?";
	String yourName = "Okay, your character's name will be "+name+".";
        // Create instance of InputAndConfirm class, call getInput method for character name
	String name = new InputAndConfirm.getInput(enterName);
        // Confirm user input for character name
	new getConfirmation(correctName, yourName);
        return name
    }

    // Method for receiving character race from user
    public String getRace() {
        String enterRace = "Please enter your character's race: ";
	String correctName = "You have entered "+race+" for your character's race, is this correct?";
	String yourName = "Okay, your character's race will be "+race+".";
	// Create instance of InputAndConfirm class, call getInput method for character race
	String race = new InputAndConfirm.getInput(enterRace);
	// Confirm user input for character race
	new getConfirmation(correctRace, yourRace);
    }
}

// Define main class
public static void main(String[] args) {
	
// Get and confirm character name
String charName = new createCharacter.getName();
// This field is still in progress
String charRace = new createCharacter.getRace();
	
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
