package string_Classes;

public class StringBuffer_06 {
 
	
	// here we can use the same variable again and again ,
	//add more value to same variable or delete from it
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Zahid ");
		
		System.out.println(sb);
		
		sb.append("Md ");
		sb.append("24 ");
		
		System.out.println(sb);
		
		
		sb.reverse();
		System.out.println(sb);
		
		sb.delete(0, 5);         // 0 - 5th index will delate. 
		System.out.println(sb);

		sb.setLength(5);
		System.out.println(sb);
		
	}

}
