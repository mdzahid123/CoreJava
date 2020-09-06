package string_Classes;

public class String_05_Palindrome {

	
	/*
	 * 
	 *  A palindrome is if we reverse a string 
	 *  and its still match to the previous one then its a Palindrome. 
	 * 
	 * like 121  and MAM is a palindrome. 
	 */
	
	
	public static void main(String[] args) {
		
		String s1 = "mam";
		
		StringBuffer sb = new StringBuffer(s1);

		String s2 = sb.reverse().toString();
		
		if(s1.equals(s2)) {
			System.out.println("Palindrome");
		
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
