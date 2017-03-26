package voltaire.medina;
import java.util.*;

public class Driver {

	public static void main (String args[]){
		
		Scanner keyboard = new Scanner (System.in);
		
		int userCHOICE;
		
		System.out.println("Take in simple user input, \n press 1 for Post Apocalyptic\n press 2 for Fantasy\n press 3 for Horror");
		
		userCHOICE = keyboard.nextInt();
		
		ArrayList<String> name = new ArrayList<String>();
		
		// use a sieve implementation. 
		// sieve out the outputManager choices until x amount of combinations remain OR 
		// 		x amount of questions have been asked
		// if "user says no" {
		//		SieveAction(1)
		// }
		

	
		OutputManager outputManager = new OutputManager(); 
		outputManager.populate();
		
		if (userCHOICE == 1){
			System.out.println("Picked Genre: Post Apocalyptic");
			System.out.print("Genre type: ");
			
			System.out.println(outputManager.returnGenres());
			
			System.out.print("Game Name: ");
			System.out.println(outputManager.returnName());

		} else if (userCHOICE != 1) {
			System.out.println("Sorry, not yet implemented.");
		}
		
		
		System.exit(0);
	}

	
	
	/*
	 * https://www.reference.com/technology/kind-algorithms-used-online-random-name-generators-d0a6d460707fe571#
	 */
}
