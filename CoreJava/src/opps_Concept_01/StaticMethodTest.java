package opps_Concept_01;

public class StaticMethodTest {

	public static void main(String[] args) {
		
		StaticMethod sb1 = new StaticMethod();   // accessing display1 method creating object
		sb1.display1();
		
		StaticMethod.display2();  // accessing display2 method using class name 
		
		// 
	}

}
