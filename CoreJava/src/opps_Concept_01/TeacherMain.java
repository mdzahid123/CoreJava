package opps_Concept_01;

public class TeacherMain {

	String name, gender;
	int age, phone;
	
	/*
	 *   constructor name has to be same as class name 
	 *   it is a special type of method 
	 * 
	 *Default constructor
	 * TeacherMain(){
	 *      System.out.println("No Value")
	 * }
	 * 
	 * 
	 * parameterized constructor
	 * TeacherMain(String n, String g, int ph) {
		name = n;
		gender = g;
		phone = ph;   }
	 * 
	 * 
	 */
	
	TeacherMain(){
		System.out.println("No Value");
	}

	// Parameterized method
	void setinformation(String n, String g, int ph) {
		name = n;
		gender = g;
		phone = ph;

	}

	void displayinformation() {

		System.out.println("Teacher 1 name : " + name);
		System.out.println(" Gender : " + gender);
		System.out.println(" Phone : " + phone);
		System.out.println("\n");

	}
}
