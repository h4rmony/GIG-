package voltaire.medina;

import java.lang.*;
import java.util.ArrayList;

public class OutputDB {

	// main nouns
	ArrayList<String> name = new ArrayList<String>();
	
	
	// main 2nd nouns
	ArrayList<String> secondName = new ArrayList<String>();
	
	// unique names
	String[] uniqueName = new String[100];
	
	// name adjectives
	String[] adj = new String[100];

	//name[1] = "Counter Strike";
	//secondName[1] = "Global Offensive";
	

	public void populate(){
		name.add("Counter Strike");
		secondName.add("Global Offensive");
	}
	
	public String returnName(int index){
		return name.get(index);
	}
	
	public String returnSecondName(int index){
		return secondName.get(index);
	}
	
}
