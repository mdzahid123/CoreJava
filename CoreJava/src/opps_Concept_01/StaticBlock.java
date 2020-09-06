package opps_Concept_01;

public class StaticBlock {
	
	static int  id; 
	static String name; 
	
	//creating static block {}
	static {
		id = 101;
		name = "kaishssa";
	}

		// creating static method
	static void display() {
		
		System.out.println(" Id is : " + id);
		System.out.println(" Name is " + name);
	}
	
	
	public static void main(String[] args) {
		StaticBlock.display();
	}
	
	
}
