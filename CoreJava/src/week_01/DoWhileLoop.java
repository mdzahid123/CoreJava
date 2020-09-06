package week_01;

public class DoWhileLoop {
	
	// the difference between while loop and Do_While loop is : 
	//for the do while loop the condition stay at the end after while 
	// the do while loop execute at least 1 time even the condition is false, because the condition stay at the end 
	// and execution part (print line) comes before condition part. 

	public static void main(String[] args) {
		
		
		int i=1;
		
		do {
			System.out.println(i+ " Bangladesh");
			i++;
			
		}while (i<=10);

	}

}
