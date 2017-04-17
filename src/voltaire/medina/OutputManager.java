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
	String[] detailedAdj = new String[10];
	String[] detailedNoun = new String[10];
	
	// main nouns
	NameNode[] name = new NameNode[10];
	
	// main 2nd nouns
	NameNode[] secondName = new NameNode[10];
	
	// unique names
	NameNode[] unique = new NameNode[10];
	
	// name adjectives
	NameNode[] adj = new NameNode[10];
	

	public void populatePostApoc(){
		
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
		verbAfterPnoun[2] = "infiltrates";
		verbAfterPnoun[3] = "destroys";
		verbAfterPnoun[4] = "enters";
		verbAfterPnoun[5] = "loots";
		verbAfterPnoun[6] = "discovers";
		verbAfterPnoun[7] = "breaks";
		verbAfterPnoun[8] = "escapes";
		verbAfterPnoun[9] = "adventures";
		
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
		
		detailedAdj[0] = "dangerous";
		detailedAdj[1] = "blood stained";
		detailedAdj[2] = "ice frosted";
		detailedAdj[3] = "infected";
		detailedAdj[4] = "diseased";
		detailedAdj[5] = "zombie populated";
		detailedAdj[6] = "zombie stricken";
		detailedAdj[7] = "alien populated";
		detailedAdj[8] = "hostile";
		detailedAdj[9] = "malicious";
		
		detailedNoun[0] = "peculiar crashsite";
		detailedNoun[1] = "abandoned house";
		detailedNoun[2] = "mental institution";
		detailedNoun[3] = "research facility"; 
		detailedNoun[4] = "laboratory";
		detailedNoun[5] = "military base";
		detailedNoun[6] = "close relative's hideout";
		detailedNoun[7] = "close friend's hideout";
		detailedNoun[8] = "hideout full of bandits";
		detailedNoun[9] = "neighboring clan";
		
	}
	
	public void populateFantasy(){
		
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
		
		playerNoun[0] = "warrior";
		playerNoun[1] = "rogue";
		playerNoun[2] = "child";
		playerNoun[3] = "wizard";
		playerNoun[4] = "elementalist";
		playerNoun[5] = "alchemist";
		playerNoun[6] = "hunter";
		playerNoun[7] = "paladin";
		playerNoun[8] = "jester";
		playerNoun[9] = "king";
		
		theToNoun[0] = "kingdom";
		theToNoun[1] = "main castle of the realm";
		theToNoun[2] = "fortress";
		theToNoun[3] = "stronghold";
		theToNoun[4] = "motherland";
		
		verbAfterNoun[0] = "has";
		verbAfterNoun[1] = "is";
		
		descAfterIs[0] = "a year from invastion. All is tense";
		descAfterIs[1] = "bombarded with enemy balistas from a nearby Orc army";
		descAfterIs[2] = "being infested by flying eyebats";
		descAfterIs[3] = "stripped away from its power due to a dark power";
		descAfterIs[4] = "flooded with an unexpected visit of the wise mages";
		descAfterIs[5] = "overheating from the radiation from an alien source";
		descAfterIs[6] = "overrun with traveling caravan bandits";
		descAfterIs[7] = "being overtaken by a cult of magic users that practice forbidden magic";
		descAfterIs[8] = "bombarded by fire from hostile airships";
		descAfterIs[9] = "being abandoned. There is no where else to go";
		
		descAfterHas[0] = "become signted from a nearby group of trolls";
		descAfterHas[1] = "been overtaken by mind-controling sages";
		descAfterHas[2] = "ran out of food. The use of magic may help..";
		descAfterHas[3] = "been struck with a deadly plague. The source is unknown";
		descAfterHas[4] = "fallen into the hands of the witches of the swamps";
		descAfterHas[5] = "been infested with potentially hazardous slime creatures";
		descAfterHas[6] = "been revitalized and has reopened";
		descAfterHas[7] = "been found by a nearby hostile group of never before seen creatures";
		descAfterHas[8] = "began to elect the new grandwizard";
		descAfterHas[9] = "been attacked by a group of knights who appear to emit black aura";
		
		verbAfterPnoun[0] = "finds";
		verbAfterPnoun[1] = "seeks";
		verbAfterPnoun[2] = "ventures";
		verbAfterPnoun[3] = "destroys";
		verbAfterPnoun[4] = "enters";
		verbAfterPnoun[5] = "loots";
		verbAfterPnoun[6] = "discovers";
		verbAfterPnoun[7] = "breaks into";
		verbAfterPnoun[8] = "escapes";
		verbAfterPnoun[9] = "adventures";
		
		descAfterAttacked[0] = "infected trolls";
		descAfterAttacked[1] = "skeletal wyverns";
		descAfterAttacked[2] = "dark magic users";
		descAfterAttacked[3] = "'The Dragon'";
		descAfterAttacked[4] = "pesky evil fairies";
		descAfterAttacked[5] = "the almighty necromancer";
		descAfterAttacked[6] = "a group of rebels that practice an ancient magic";
		descAfterAttacked[7] = "a ravaging goblin clan";
		descAfterAttacked[8] = "dark elves of the flaris";
		descAfterAttacked[9] = "the ghost of the forgotten king";
		
		detailedAdj[0] = "dangerous";
		detailedAdj[1] = "blood stained";
		detailedAdj[2] = "ice frosted";
		detailedAdj[3] = "infected";
		detailedAdj[4] = "diseased";
		detailedAdj[5] = "elven populated";
		detailedAdj[6] = "orc stricken";
		detailedAdj[7] = "magical";
		detailedAdj[8] = "hostile";
		detailedAdj[9] = "malicious";
		
		detailedNoun[0] = "crystal site";
		detailedNoun[1] = "abandoned fortress";
		detailedNoun[2] = "dragon nest";
		detailedNoun[3] = "ancient cavern"; 
		detailedNoun[4] = "magic training facility";
		detailedNoun[5] = "abandoned wyvern rider's barracks";
		detailedNoun[6] = "grandwizard's hideout";
		detailedNoun[7] = "peculiar theif's hideout";
		detailedNoun[8] = "hideout full of dead fairies";
		detailedNoun[9] = "castle of the dead";
		
	}
	
public void populateHorror(){
		
		genres[0] = "Platformer";
		genres[1] = "Shooter";
		genres[2] = "BulletHell";
		genres[3] = "Mystery";
		genres[4] = "Stealth";
		genres[5] = "Survival";
		genres[6] = "Tactical";
		genres[7] = "Sandbox";
		genres[8] = "Role Playing";
		genres[9] = "Rouge Like";
		
		playerNoun[0] = "mentally insane elderly";
		playerNoun[1] = "mentally unstable patient";
		playerNoun[2] = "child";
		playerNoun[3] = "kid";
		playerNoun[4] = "serial killer";
		playerNoun[5] = "murderer";
		playerNoun[6] = "hitman";
		playerNoun[7] = "innocent bystander";
		playerNoun[8] = "shop owner";
		playerNoun[9] = "meth addict";
		
		theToNoun[0] = "town's school";
		theToNoun[1] = "neighborhood's playground";
		theToNoun[2] = "town's library";
		theToNoun[3] = "newly purchased house";
		theToNoun[4] = "basement of a house";
		
		verbAfterNoun[0] = "has";
		verbAfterNoun[1] = "is";
		
		descAfterIs[0] = "being used as a hideout for a high priority serial killer";
		descAfterIs[1] = "the last place they saw the missing kid. The blood on the walls are a haunting sight.";
		descAfterIs[2] = "being used as a torture chamber";
		descAfterIs[3] = "investigated as the smell of decaying flesh is a concern";
		descAfterIs[4] = "flooded with a putrid scent";
		descAfterIs[5] = "being used as a hideout for a wanted criminal";
		descAfterIs[6] = "covered with blood just overnight, but no bodies were found";
		descAfterIs[7] = "reported as screams of children are heard nearby";
		descAfterIs[8] = "rattled with gunshots in the middle of the night";
		descAfterIs[9] = "abandoned as people keep missing one by one";
		
		descAfterHas[0] = "been brought up in a 911 call";
		descAfterHas[1] = "been discovered containing bodies hanging from the ceiling";
		descAfterHas[2] = "notebooks laying around filled with previous, and potential victims";
		descAfterHas[3] = "been overwhelmed with a foul smell, as if something were decaying";
		descAfterHas[4] = "been said to be haunted by the locals";
		descAfterHas[5] = "been a hotspot for crimes in the last month ,and no one knows why";
		descAfterHas[6] = "messages written on the wall in blood";
		descAfterHas[7] = "been a psycho's hotspot for potential hosts";
		descAfterHas[8] = "been marked as quarantine as a missing child has been found dead";
		descAfterHas[9] = "writings marking the next victims";
		
		verbAfterPnoun[0] = "finds";
		verbAfterPnoun[1] = "seeks";
		verbAfterPnoun[2] = "realizes";
		verbAfterPnoun[3] = "observes";
		verbAfterPnoun[4] = "locates";
		verbAfterPnoun[5] = "uncovers";
		verbAfterPnoun[6] = "discovers";
		verbAfterPnoun[7] = "notices";
		verbAfterPnoun[8] = "hunts down";
		verbAfterPnoun[9] = "tracks down";
		
		descAfterAttacked[0] = "the kid that has gone missing in the woods";
		descAfterAttacked[1] = "'IT'";
		descAfterAttacked[2] = "the child from the amber alert";
		descAfterAttacked[3] = "the psychopath of the neighborhood";
		descAfterAttacked[4] = "the clues left at the bloodied crime scene";
		descAfterAttacked[5] = "a reported 'spiritual creature' sighting";
		descAfterAttacked[6] = "a ghost sighting in an abandoned house";
		descAfterAttacked[7] = "a ghost sighting in a mental asylum";
		descAfterAttacked[8] = "the killers hideout";
		descAfterAttacked[9] = "the serial killer's list of victims";
		
		detailedAdj[0] = "dangerous";
		detailedAdj[1] = "blood stained";
		detailedAdj[2] = "contaminated";
		detailedAdj[3] = "infected";
		detailedAdj[4] = "diseased";
		detailedAdj[5] = "haunted";
		detailedAdj[6] = "haunted";
		detailedAdj[7] = "possessed";
		detailedAdj[8] = "cursed";
		detailedAdj[9] = "blood stained";
		
		detailedNoun[0] = "mental hospital";
		detailedNoun[1] = "abandoned house";
		detailedNoun[2] = "mental institution";
		detailedNoun[3] = "research facility"; 
		detailedNoun[4] = "laboratory";
		detailedNoun[5] = "satanic church";
		detailedNoun[6] = "mental asylum";
		detailedNoun[7] = "asylum";
		detailedNoun[8] = "abandoned house";
		detailedNoun[9] = "abandoned library";
		
	}
	

	public String returnNamePostApoc(){
		
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
		uniqueName[4] = "Desmond";
		uniqueName[5] = "David";
		uniqueName[6] = "Ollie";
		uniqueName[7] = "Kent";
		uniqueName[8] = "Issac";
		uniqueName[9] = "Joel";
		
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
	
	public String returnNameFantasy(){
		
		String finalName = null;
		String preName = null;
		
		String constanant = "bcdfghjklmnpqrstvwxy";
		
		String upperConstanant = "BCDFGHJKLMNPQRSTVWYZ";
		String vowel = "auiou";
		String[] pstring = new String[10];
		
		pstring[0] = "Requiem";
		pstring[1] = "Destiny";
		pstring[2] = "Balad";
		pstring[3] = "Creed";
		pstring[4] = "Nest";
		pstring[5] = "World";
		pstring[6] = "Sign";
		pstring[7] = "Favor";
		pstring[8] = "Province";
		pstring[9] = "Area";
		
		String[] uniqueName = new String[10];
		
		uniqueName[0] = "Loca";
		uniqueName[1] = "Lux";
		uniqueName[2] = "Angard";
		uniqueName[3] = "Tasof";
		uniqueName[4] = "Heather";
		uniqueName[5] = "Duradel";
		uniqueName[6] = "Cha'iss";
		uniqueName[7] = "Eunta";
		uniqueName[8] = "Lyetia";
		uniqueName[9] = "Engold";
		
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
	
	public String returnNameHorror(){
		
		String finalName = null;
		String preName = null;
		
		// no x
		String constanant = "bcdfghjklmnpqrstvwxy";
		
		// no X
		String upperConstanant = "BCDFGHJKLMNPQRSTVWYZ";
		String vowel = "auiou";
		String[] pstring = new String[10];
		
		pstring[0] = "Escape";
		pstring[1] = "Corridor";
		pstring[2] = "Break";
		pstring[3] = "Demise";
		pstring[4] = "Assension";
		pstring[5] = "End";
		pstring[6] = "Sign";
		pstring[7] = "Death";
		pstring[8] = "Escape";
		pstring[9] = "Area";
		
		String[] uniqueName = new String[10];
		
		uniqueName[0] = "Edvin";
		uniqueName[1] = "Emanuel";
		uniqueName[2] = "Cooper";
		uniqueName[3] = "Frank";
		uniqueName[4] = "Desmond";
		uniqueName[5] = "David";
		uniqueName[6] = "Ollie";
		uniqueName[7] = "Kent";
		uniqueName[8] = "Issac";
		uniqueName[9] = "Neal";
		
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
			
			if (rand.nextInt(5) < 1){
				return(firstWord + playerNoun[rand10] + " has been attacked by " + descAfterAttacked[rand.nextInt(10)] + ".");
			} else {
				return(firstWord + playerNoun[rand10] + " " + verbAfterPnoun[rand.nextInt(10)] + " a " + detailedAdj[rand.nextInt(10)] +
						" " + detailedNoun[rand.nextInt(10)] + ".");
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