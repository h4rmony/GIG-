package voltaire.medina;
import java.util.*;

public class Driver {

	public static void main (String args[]){
		
		Scanner keyboard = new Scanner (System.in);
		
		String userBOOL; 
		int userCHOICE;
		
		System.out.println("Take in simple user imput, yes | no ");
		
		userBOOL = keyboard.nextLine();
		
		System.out.println("Take in simple user input, \n press 1 for A\n press 2 for B\n press 3 for C");
		
		userCHOICE = keyboard.nextInt();
		
		ArrayList<String> name = new ArrayList<String>();
		
		// use a sieve implementation. 
		// sieve out the database choices until x amount of combinations remain OR 
		// 		x amount of questions have been asked
		// if "user says no" {
		//		SieveAction(1)
		// }
		

		
		
		
		
		// output test 1
		
		OutputDB database = new OutputDB();
		database.populate();
		
		System.out.println(database.returnName(0) + " " + database.returnSecondName(0));
		
		// output test 1
		
		
		System.exit(0);
	}
	
}
