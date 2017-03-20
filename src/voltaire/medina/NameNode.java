package voltaire.medina;

public class NameNode {

	NameNode NodeObject;
	String name;
	int genre;
	
	/*
	 * Genre:
	 * 1) Shooter 
	 * 
	 * 
	 * 
	 */
	
	public void add(String name, int genre) {
		
		NodeObject = new NameNode();
		this.name = name;
		this.genre = genre;
	}
	
}
