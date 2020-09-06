package opps_Concept_01;

public class Static_Variable_Test {

	public static void main(String[] args) {
		
		/*
		 * > static members/variable are not object relates, its class related
		 * > when we use static we don't need to create objects. 
		 * > we can directly call by class name 
		 * 
		 */
		
		// without static key word i had to create this object
		//StaticVariable sb = new StaticVariable();
		//System.out.println("University Name is : " + sb.universityName);
		
		
		// if i use static before university name then, i can directly use the class name 
		System.out.println("University Name is : " + StaticVariable.universityName);
		
		
		
		

	

	}

}
