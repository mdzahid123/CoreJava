package opps_Concept_01;

public class TeacherTest {

	public static void main(String[] args) {
		
		TeacherMain teacher1 = new TeacherMain();
		
		/*teacher1.name = "Amin";
		teacher1.gender = "mail";
		teacher1.age = 43;
		teacher1.phone = 347010101; */
		
		teacher1.setinformation("Amin", "Mail", 34701010);
		teacher1.displayinformation();
		

		
		TeacherMain teacher2 = new TeacherMain();
		
		teacher2.name = "Momin";
		teacher2.gender = "mail";
		teacher2.age = 29;
		teacher2.phone = 516010101;
		teacher2.displayinformation();
		
		TeacherMain teacher3 = new TeacherMain();
		
		
		
	}
	

}
