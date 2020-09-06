package opp_Concept_02;

public class MethodOverriding_02 extends MethodOverriding {
 
		// name, age, displayinfo is already here

		String qualification;
		
		
		@Override
		void displayinfo() {
			System.out.println("Nmae is : " + name);
			System.out.println("Age is : " + age);
			System.out.println("Qalification is : " + qualification);
		  }

	}


