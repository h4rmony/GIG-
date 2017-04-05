package voltaire.medina;

import java.lang.*;
import java.util.Random;
import java.util.ArrayList;

public class OutputManager {

	// genres
	String[] genres = new String[10];
	
	// description arrays
	String[] playerNoun = new String[10];
	String[] theToNoun = new String[5];
	String[] verbAfterNoun = new String[2];
	String[] descAfterIs = new String[10];
	String[] descAfterHas = new String[10];
	String[] verbAfterPnoun = new String[10];
	String[] descAfterAttacked = new String[10];
	
	// main nouns
	NameNode[] name = new NameNode[10];
	
	// main 2nd nouns
	NameNode[] secondName = new NameNode[10];
	
	// unique names
	NameNode[] unique = new NameNode[10];
	
	// name adjectives
	NameNode[] adj = new NameNode[10];
	

	public void populate(){
		
		genres[0] = "Platformer";
		genres[1] = "Shooter";
		genres[2] = "BulletHell";
		genres[3] = "Fighter";
		genres[4] = "Stealth";
		genres[5] = "Survival";
		genres[6] = "Tactical";
		genres[7] = "Sandbox";
		genres[8] = "Role Playing";
		genres[9] = "Rouge Like";
		
		playerNoun[0] = "adventurer";
		playerNoun[1] = "exile";
		playerNoun[2] = "child";
		playerNoun[3] = "bounty hunter";
		playerNoun[4] = "unwanted freak";
		playerNoun[5] = "assassin";
		playerNoun[6] = "hunter";
		playerNoun[7] = "mechanic";
		playerNoun[8] = "shop owner";
		playerNoun[9] = "kid";
		
		theToNoun[0] = "Earth";
		theToNoun[1] = "homeland";
		theToNoun[2] = "planet";
		theToNoun[3] = "planetary space hub";
		theToNoun[4] = "motherland";
		
		verbAfterNoun[0] = "has";
		verbAfterNoun[1] = "is";
		
		descAfterIs[0] = "a year from total destruction";
		descAfterIs[1] = "bombarded with foreign asteriods that seem to be moving";
		descAfterIs[2] = "being infested by man-eating super bees";
		descAfterIs[3] = "stripped away from its oxygen";
		descAfterIs[4] = "flooded with a foreign liquid substance from space";
		descAfterIs[5] = "overheating from the radiation from an alien source";
		descAfterIs[6] = "overrun with hatching alien eggs";
		descAfterIs[7] = "being overtaken by rebels";
		descAfterIs[8] = "bombarded with hazardous space debris. Chaos everywhere";
		descAfterIs[9] = "being abandoned. There is no where else to go";
		
		descAfterHas[0] = "become signted from a nearby alien planet";
		descAfterHas[1] = "been overtaken by mind-controlled government officials";
		descAfterHas[2] = "ran out of water, and uprisings have began";
		descAfterHas[3] = "been struck with a deadly plague. The source is unknown";
		descAfterHas[4] = "fallen into the hands of the alien race";
		descAfterHas[5] = "been infested with a slimey toxic foreign substance";
		descAfterHas[6] = "started to deteriorate because of the unstable atmosphere";
		descAfterHas[7] = "been found by a nearby hostile new discovered species";
		descAfterHas[8] = "began to crumble. Panic arises";
		descAfterHas[9] = "been attacked by a new intelligent plant species";
		
		verbAfterPnoun[0] = "finds";
		verbAfterPnoun[1] = "seeks";
		verbAfterPnoun[2] = "mistakens";
		verbAfterPnoun[3] = "destroys";
		verbAfterPnoun[4] = "enters";
		verbAfterPnoun[5] = "loots";
		verbAfterPnoun[6] = "discovers";
		verbAfterPnoun[7] = "breaks";
		verbAfterPnoun[8] = "escapes";
		verbAfterPnoun[9] = "acquires";
		
		descAfterAttacked[0] = "the infected";
		descAfterAttacked[1] = "'THEM'";
		descAfterAttacked[2] = "a neighboring hostile clan";
		descAfterAttacked[3] = "superior man-eating insects";
		descAfterAttacked[4] = "creatures that fell from the sky";
		descAfterAttacked[5] = "a group of scavengers or raiders";
		descAfterAttacked[6] = "an unknown emerging species";
		descAfterAttacked[7] = "microscopic parasites";
		descAfterAttacked[8] = "rabid infected humans";
		descAfterAttacked[9] = "emerging man-eating intelligent plants";
		
		// initialize name nodes
		for (int x = 0; x < name.length; x++){
			name [x] = new NameNode();
		}
		
		// initialize secondName nodes
		for (int x = 0; x < secondName.length; x++){
			secondName [x] = new NameNode();
		}
		
		// initialize unique nodes
		for (int x = 0; x < unique.length; x++){
			unique [x] = new NameNode();
		}

	}
	
	
	// will use Markov chain
	public String returnName(){
		
		String finalName = null;
		String preName = null;
		
		// no x
		String constanant = "bcdfghjklmnpqrstvwxy";
		
		// no X
		String upperConstanant = "BCDFGHJKLMNPQRSTVWYZ";
		String vowel = "auiou";
		String[] pstring = new String[10];
		
		pstring[0] = "Requiem";
		pstring[1] = "Destiny";
		pstring[2] = "Valor";
		pstring[3] = "Creed";
		pstring[4] = "Nest";
		pstring[5] = "World";
		pstring[6] = "Sign";
		pstring[7] = "Favor";
		pstring[8] = "Province";
		pstring[9] = "Area";
		
		String[] uniqueName = new String[10];
		
		uniqueName[0] = "David";
		uniqueName[1] = "Quinn";
		uniqueName[2] = "Cooper";
		uniqueName[3] = "Ellie";
		uniqueName[4] = "Pol";
		uniqueName[5] = "David";
		uniqueName[6] = "Ollie";
		uniqueName[7] = "Kip";
		uniqueName[8] = "Lee";
		uniqueName[9] = "Reev";
		
		Random rand = new Random();

		int randomC = rand.nextInt(19);
		int randomC2 = rand.nextInt(19);
		int randomC3 = rand.nextInt(19);
		
		int randomV = rand.nextInt(4);
		int randomV2 = rand.nextInt(4);
		int randomV3 = rand.nextInt(4);
		
		int randomPS = rand.nextInt(10);
		int randomPN = rand.nextInt(3);
		int randomPNnum = rand.nextInt(10);
		
		if (randomPN == 2) {
			preName = uniqueName[randomPNnum];
		} else {
		preName = (" " + upperConstanant.charAt(randomC) + vowel.charAt(randomV) 
				 + constanant.charAt(randomC2) + vowel.charAt(randomV2) 
				 + vowel.charAt(randomV3) + constanant.charAt(randomC3));
		}
		
		// 50% chance for possessive 
		int halfChance = rand.nextInt(2);
		String possessionString;
		if (halfChance == 0){
			possessionString = "'s " + pstring[randomPS];
		} else {
			possessionString = " ";
		}

		finalName = preName + possessionString;
		return finalName;
	}
	
	
	
	
	
	
	public String returnDescription(){
		
		Random rand = new Random();
		String firstWord;
		
		
		if (rand.nextInt(3) < 2){
			
			int rand10 = rand.nextInt(10);
		
			// if playerNoun is vowel: an
			if(playerNoun[rand10].charAt(0) == 'a' || playerNoun[rand10].charAt(0) == 'e' ||
					playerNoun[rand10].charAt(0) == 'i' || playerNoun[rand10].charAt(0) == 'o'
					|| playerNoun[rand10].charAt(0) == 'u') {
				firstWord = "An ";
			} else {
				firstWord = "A ";
			}
			
			if (rand.nextInt(5) < 2){
				return(firstWord + playerNoun[rand10] + " has been attacked by " + descAfterAttacked[rand.nextInt(10)] + ".");
			} else {
				return(firstWord + playerNoun[rand10] + " " + verbAfterPnoun[rand.nextInt(10)] + " a" + "...");
			}
			
			
		} else {
			
			int randomNumVerbAfter = rand.nextInt(2);
			
			if (randomNumVerbAfter == 1){
				return("The " + theToNoun[rand.nextInt(5)] + " " + verbAfterNoun[randomNumVerbAfter] + " " + descAfterIs[rand.nextInt(7)] + ".");
			} else {
				return("The " + theToNoun[rand.nextInt(5)] + " " + verbAfterNoun[randomNumVerbAfter] + " " + descAfterHas[rand.nextInt(7)] + ".");
			}
		}
		
		
		
		/*	Desc. Example:
		 * 
		 * An exile finds his/her way through trecherous lands.
		 * An adverturer trys to escape 
		 * The Earth has become infested with eggs
		 * The Earth is a year from mass destruction
		 * 
		 * Also at end, do math for how many possible different descriptions/ game names
		 * 
		 * This implementation for the description, is a simple yet effective strategy
		 * 
		 * 
		 * "Name" has discovered a new dimention/alternate reality
		 */
	}
	
	public String postApocResource(){
		
		/*	This method will return some random games
		 * 	or some common notions of a post apocalyptic game 
		 */
		
		String mystring = null;
		return mystring;
	}
	
	
	
	
	
	public String returnGenres(){
		
		int indexCap = genres.length;
		Random rand = new Random();
		int randomNum = rand.nextInt(indexCap);
								
		String genre1 = genres[randomNum];
		randomNum = rand.nextInt(indexCap);
		
		String genre2 = genres[randomNum];
		randomNum = rand.nextInt(indexCap);
		
		// reroll if matching
		while (genre1 == genre2){
			genre2 = genres[randomNum];
			randomNum = rand.nextInt(indexCap);
			
			if (genre1 != genre2){
				break;
			}
		}
		
		// reroll if null
		while (genre1 == null || genre2 == null) {
			genre1 = genres[randomNum];
			randomNum = rand.nextInt(indexCap);
			
			if (genre1 != null && genre2 != null){
				break;
			}
		}
		
		return (genre1 + " - " + genre2);
		
	}
	
	
	
}