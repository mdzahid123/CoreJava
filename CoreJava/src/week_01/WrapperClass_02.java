package week_01;

public class WrapperClass_02 {

	public static void main(String[] args) {
		
		// Object to Primitive 
		
		Double d = new Double (10.5);
		System.out.println("d = : " + d );
 
		
		double e = d.doubleValue(); 
		// we can also write here double e =d;
	   // same as d.doubleValue(); //its called unboxing 
		
		
		System.out.println("e = : " + e);
		
		// clreate more classes like this 
		
	}
}
