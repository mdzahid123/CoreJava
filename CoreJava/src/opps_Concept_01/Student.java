package opps_Concept_01;

public class Student {

	// static variable part - 01

	/*
	  1. Static variable 
	  2. Static method 
	  3. Static block
	 
	  >> Static keyword is used for memory management.
	  >> it makes the program more efficient by saving memory
	 */

			String name;
			int id;
			static String universityName = "BC";  //using static write once print everywhere. 
		
			Student(String n, int i) {
		
				name = n;
				id = i;
			}
			
			void displayInformation() {
				System.out.println("Nmae : " + name );
				System.out.println(" Id : " + id);
				System.out.println(" University Name : " + universityName);
			}
			 
			
			

	
	
	
}
