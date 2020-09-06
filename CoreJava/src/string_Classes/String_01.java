package string_Classes;

public class String_01 {

	public static void main(String[] args) {
		
		
		/*
		 * > String is a sequence of characters
		 *  There are 3 different type of String class
		 *  1. String class 
		 *  2. String Buffer
		 *  3. String Builder
		 **/
		
		
		String s1 = "md zahid ";        // s1 = variable , md zahid  = value, 
		String s2 =  new String ("java");   // new String = creating object, different way to create String
		
		// taking character type of array = String
		
		char[] s3 = {'z', 'a', 'h', 'i', 'd'};  // they will print together 
		System.out.println(s3);
		
		
		int len = s3.length;
		
		System.out.println(" Lenth of s3 = " + len); 
		
		if (s1.equals(s2)){             // we can also use equalsIgnore case or contain methods
		   System.out.println( "Equals"); 
		   
		} else {
			   System.out.println( "Not Equals");
		   
		   }
		 
		//boolean 
		// use of contain method 
		// use of Isempty method
		

	}

}
