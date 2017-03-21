package voltaire.medina;

public class NameNode {

	NameNode NodeObject;
	String name;
	int genre;
	int genre2;
	int mood;
	
	public void add(String name, int genre, int mood) {
		
		NodeObject = new NameNode();
		this.name = name;
		this.genre = genre;
		this.mood = mood;
	}
	
	public void add(String name, int genre) {
		
		NodeObject = new NameNode();
		this.name = name;
		this.genre = genre;
		
	}
	
	public void add(String name, int genre, int genre2, int mood) {
		
		NodeObject = new NameNode();
		this.name = name;
		this.genre = genre;
		this.genre2 = genre2;
		this.mood = mood;
	}
}
