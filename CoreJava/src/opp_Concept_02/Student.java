package opp_Concept_02;

public class Student extends Teacher{

	String qualification;
	
	void displayinformation2() {
		
		System.out.println(" Qualification is :" + qualification);
	}
	
	
	// We can aslo do it in a different class 
  public static void main(String[] args) {
	
	  Teacher t1 = new Teacher();
	  Student s1 = new Student();
	  
	  t1.name = "Bussel";
	  t1.age = 43;
	  s1.qualification = "QA Expert ";
	  
	  t1.dispalyInformation();
	  s1.displayinformation2();
	  
  	}

}
