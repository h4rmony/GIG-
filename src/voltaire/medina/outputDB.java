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
		
		
		
		
		// add database values
		name[0].add("Counter Strike", 1);	
		secondName[0].add("Global Offensive", 1);
		
	}
	
	public String returnName(int index){
		return name[index].name;
	}
	
	public String returnSecondName(int index){
		return secondName[index].name;
	}
	
	
	
}
