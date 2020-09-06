package string_Classes;

public class String_03 {

	public static void main(String[] args) {
	
		String country = "   United States    ";
		System.out.println(country);
		
		// removing spaces from the beginning and at the end
		
		String s1 = country.trim();
		System.out.println(s1);
		 
		char character = country.charAt(0);   // character is in zero index
		System.out.println("character is : " + character);
		
		int value = country.codePointAt(0);
		System.out.println( "value is : " + value );
		
		int position = country.indexOf('s');
		System.out.println(" The index position of S is : " + position);
		
		position = country.lastIndexOf('t');
		System.out.println("The last position of T is : " + position);
		
		
		
		
 }
}
