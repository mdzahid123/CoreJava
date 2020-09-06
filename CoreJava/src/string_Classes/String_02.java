package string_Classes;

public class String_02 {

	public static void main(String[] args) {
		
		String firstname = "Md";
		String lastname = " Zahid";
		
		String fullname = firstname + lastname; 
		System.out.println(fullname);
		
		String uppercase = fullname.toUpperCase();
		System.out.println(uppercase);
		
		String lowercase = fullname.toLowerCase();
		System.out.println(lowercase);
		
		// boolean 
		
		// startswith 
		// endswith 
		
		
		// use of for String array and for each loop 
		
		String [] names = {"zahid", "zisan", "zihad" };
		
		for ( String x : names) {
			System.out.println(x);
		}
		
		
	}

}
