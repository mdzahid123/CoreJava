package week_01;

public class WrapperClass_01 {

	/*
	 * Wrapper classes are used to convert primitive into object and object into primitive. 
	 *  
	 *  boolean = Boolean // capital B 
	 *  int = Integer 
	 *  char = Character    // all the data type in capital beginning and full name
	 *  
	 *  Autoboxing = converting primitive to object 
	 *  Unboxing = converting object to primitive 
	 */
	
	
	public static void main(String[] args) {
		  
		
		// primitive to object 
		
		int x = 30 ; 
		Integer y = Integer.valueOf(x);    // use of value of method 
		System.out.println("Y = : " + y);
		
		
		Integer z = x;   // Integer.valueOf (x)  // its called AutoBoxing
		System.out.println("z = : " + z);
		
		
	}
}
