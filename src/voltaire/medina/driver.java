package voltaire.medina;
import java.util.*;

public class driver {

	public static void main (String args[]){
		
		Scanner keyboard = new Scanner (System.in);
		
		String userBOOL; 
		int userCHOICE;
		
		System.out.println("Take in simple user imput, yes | no ");
		
		userBOOL = keyboard.nextLine();
		
		System.out.println("Take in simple user input, \n press 1 for A\n press 2 for B\n press 3 for C");
		
		userCHOICE = keyboard.nextInt();
		
		// use a sieve implementation. 
		// sieve out the database choices until x amount of combinations remain OR 
		// 		x amount of questions have been asked
		// if "user says no" {
		//		SieveAction(1)
		// }
	}
	
}
