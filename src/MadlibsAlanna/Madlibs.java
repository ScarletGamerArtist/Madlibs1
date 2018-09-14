package MadlibsAlanna;

import java.util.Scanner;
/*
 * Alanna Botscharow
 * 9/18
 * A Mad libs Program
 */
public class Madlibs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String adj;
		String name;
		String occ;
		String vrb;
		String plants;
		String adj2;
		String noun;
		String noun2;
		String name2;
		
		//A prompt for the user
		System.out.println("Enter and adjective");
		adj = input.nextLine();
		System.out.println("Enter a person's name");
		name = input.nextLine();
		System.out.println("Enter an occupation");
		occ = input.nextLine();
		System.out.println("Enter a ver ending with'ing'");
		vrb = input.nextLine();
		System.out.println("Enter a plant [plural]");
		plants = input.nextLine();
		System.out.println("Enter an adjective");
		adj2 = input.nextLine();
		System.out.println("Enter a noun [plural]");
		noun = input.nextLine();
		System.out.println("Enter a noun");
		noun2 = input.nextLine();
		System.out.println("Enter a person's name");
		name2 = input.nextLine();
	
	    //Get user input
		
		
		
		
		
		
	
		
		
		
		
		//display the Mad lib with the users input
		
		System.out.println(" " + adj + " " + name + " Brothers is a popular video game where you control ");  		
		System.out.println("a/an " + occ + " as he/she runs through levels " + vrb + " on enemies and eating " +plants+ " to ");
		System.out.println(" the " + adj2 + " and fireflowers so that he/she can throw " + noun + " at enemies. He does all this to save");
		System.out.println( " the " + noun2 + " from the evil " + name2 + ".");
	}

}
