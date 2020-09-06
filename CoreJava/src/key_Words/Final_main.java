package key_Words;

public class Final_main {

	// use of final keyword 
	
		/**   Using the final keyword will restrict the user.  
		 
		 1. final variable 
		 2. final method
		 3. final class
		 
		 		//final variable 
		 		 * blank final variable 
		 		 * static blank final variable 
	
	* final method can't be overridden but it can be inherit. 
	*final class can't be extends to other classes. 

		 */
	
	// when we declare final it will be constant, or permanent 
	// we can't change it later
	
	final String college = "Brooklyn college";
	final int fees; // blank final variable , when we don't assign the value
	
	// and only way to assign the blank final variable 
	//is to create constructor 
	
	// create a constructor 
	Final_main(){
		fees = 3800;
	}
	
	/* static block static blank final variable/ 
	 * similar to blank final variable just use static before 
	 * and use static block 
	
	 static final int fees;
	 
	 // create a static block 
	 static{
	 		fees = 3800;
	 		} 
	 */
	
	void display() {
		System.out.println(" College name : " + college);
		System.out.println(" Tuition fees: " + fees);
	}
	
}
