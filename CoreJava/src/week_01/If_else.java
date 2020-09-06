package week_01;

import java.util.Scanner;

public class If_else {
	
	
	/*
	 * If : > There is always a Condition 
	   
	 * Else If : > There is also a Condition 
	 *  
	 *  Else : > There in no Condition  ( And always we have to use else at the end) 
	 */


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num;

		System.out.println("Enter any number:  ");
		num = input.nextInt();
		
		
		
		if (num > 5 ) {
			
			System.out.println( "Positive");
		}
		
		else if  ( num > 5){
			 
			System.out.println( "Negative");
		}

		else {
			System.out.println( " Equel to ");
		}
	}

}
