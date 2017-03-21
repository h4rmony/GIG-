package voltaire.medina;

import java.lang.*;
import java.util.ArrayList;

public class OutputDB {

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
	
	public String returnName(int index){
		return name[index].name;
	}
	
	public String returnSecondName(int index){
		return secondName[index].name;
	}
	
	
	
}
