package week_01;

public class ForLoop {

	/*
	 * a loop statement allows us to execute a statement or group of statement
	 * multiple times
	 * 
	 * there are 3 part in for loop > initialization, Condition, increment/decrement
	 */

	public static void main(String[] args) {

		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " Bangladesh");  // print Bangladesh 10 times 
		}

		 
		for (int i = 2; i <= 100; i= i+2) {    // print only even number 2- 100

			System.out.println(i);
		}

	}

}
