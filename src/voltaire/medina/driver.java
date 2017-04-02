package voltaire.medina;
import java.util.*;
import java.util.Random;


public class Driver {

	public static void main (String args[]){
		
		Scanner keyboard = new Scanner (System.in);
		
		int userCHOICE;
		
		Random rand = new Random();
		int rand5 = rand.nextInt(5);
		
		if (rand5 == 0){
			System.out.println("Welcome to GIG, fire away!");
		} else if (rand5 == 1){
			System.out.println("GIG is ready to rumble! Are you?");
		} else if (rand5 == 2){
			System.out.println("Eenie meenie miney mo, GIG is already ready to go!");
		} else if (rand5 == 3){
			System.out.println("Go, go, go you have a game to make!");
		} else if (rand5 == 4){
			System.out.println("GIG is waiting for you. Hurry dont make her mad...");
		}
		
		System.out.println("\n press 1 for Post Apocalyptic\n press 2 for Fantasy\n press 3 for Horror");
		
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
			
			System.out.print("Description: ");
			System.out.println(outputManager.returnDescription());

		} else if (userCHOICE != 1) {
			System.out.println("Sorry, not yet implemented.");
		}
		
		
		System.exit(0);
	}

	
	/*
	 * https://www.reference.com/technology/kind-algorithms-used-online-random-name-generators-d0a6d460707fe571#
	 */
}