package voltaire.medina;

import java.lang.*;
import java.util.Random;
import java.util.ArrayList;

public class OutputManager {

	// genres
	String[] genres = new String[10];
	
	
	
	
	
	
	// main nouns
	NameNode[] name = new NameNode[10];
	
	// main 2nd nouns
	NameNode[] secondName = new NameNode[10];
	
	// unique names
	NameNode[] unique = new NameNode[10];
	
	// name adjectives
	NameNode[] adj = new NameNode[10];

	//name[1] = "Counter Strike";
	//secondName[1] = "Global Offensive";
	

	public void populate(){
		
		
		genres[0] = "Platformer";
		genres[1] = "Shooter";
		genres[2] = "BulletHell";
		genres[3] = "Fighter";
		genres[4] = "Stealth";
		genres[5] = "Survival";
		genres[6] = "Tactical";
		genres[7] = "Sandbox";
		
		
		
		
		
		
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
		
		
		/*
		 * Genre:
		 * 1) Shooter 
		 * 2) Platformer
		 * 3) Survival
		 * 4) Adventure
		 * 
		 * Genre2:
		 * 1) Free World
		 * 2) Arcade
		 * 
		 * 
		 * Mood: 
		 * 1) Horror
		 * 2) Apocalyptic/PostApoc
		 * 
		 * 
		 * 
		 */
		
		// add database values
		name[0].add("Counter Strike", 1);	
		secondName[0].add("Global Offensive", 1);
		unique[0].add("Terraria", 2, 1 );
		unique[1].add("The Last Of Us", 3, 2);
		unique[2].add("Outlast", 3, 1);
		
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
	
	public String returnSecondName(int index){
		return secondName[index].name;
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
