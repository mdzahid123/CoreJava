package opps_Concept_01;

public class VariableType {
	
	/** 3 types of variable 
	 
	 1. local variable 
	 2. Instance variable 
	 3. class or static variable 
	 **/
	
	
	/** 1. local variable :
	     is a variable that is declared inside a method , constructor or block. 
	 */
	// 2. these local variable can not be used in other method.
			/* ex: 
			
		variabletype(String n, int i) // n and i is local variable here.
			
			{      
			name = n;  				
			id =  i;       
			}				
			
			*/
		
			
	/** 2. Instance variable  **/
	 
				/* 1.  A variable that is declared inside a class but outside any method. 
				   2.  instance variable can not be decare as static 
				 
				 public class variableType{
				 
				 String name; 
				 int id; 
				 
				 }
				  */
				
	
	/**3. class or static variable  **/
	
	/*
	
	 1. A variable declared as static is a static variable 
	 2. and they can not be declare as local variable 
	 
	    static Stirng universityName;
	 */
	

}
