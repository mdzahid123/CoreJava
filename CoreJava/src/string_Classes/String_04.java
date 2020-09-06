package string_Classes;

public class String_04 {

	public static void main(String[] args) {
		
		
		String s1= " ami kittam eakhom ";
		System.out.println(s1);
		
		
		String s2 = s1.replace('m', 'n');
		System.out.println(s2);
 
		String[] s3 = s1.split(" ");  // dividing s1 value into 3 lines 
		for ( String x : s3) {	
			System.out.println(x);
		
		}
		
	}
}
