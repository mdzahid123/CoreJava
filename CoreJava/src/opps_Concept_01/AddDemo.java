package opps_Concept_01;

public class AddDemo {
	
	/**   variable length arguments   
	 *  (. . .) these 3 dot can take any length of arguments 
	 *  
	 *   A method that take a variable number of arguments is call varargs method. 
	 */
	
	void add(int ... num) {
		
		int sum = 0; 
		for (int x: num) {
			sum = sum + x; 
		}
	
		System.out.println(sum);
	}
}
