package week_01;

import java.util.Scanner;

public class Array_05 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner (System.in);
	int [][] A = new int[2][3];
	int [][] B = new int [2][3];
	
	// getting input for a metrix
	
	System.out.println(" Enter element for A metrix= ");
	for (int row = 0; row <2; row++) {
		for (int col = 0; col < 3; col++) {
			System.out.printf("A[%d][%d] ", row, col);
			A [row][col] = input.nextInt();
			
		}
	}
	// printing A metrix 
	
		for (int row = 0; row <2; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(" " + A [row] [col]);
			}
			
			System.out.println();
		}
	
		//..........................................
		
		
		System.out.println(" Enter element for B metrix= ");
		// getting input for B metrix
		
		for (int row = 0; row <2; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.printf("B[%d][%d] ", row, col);
				B [row][col] = input.nextInt();
				
			}
		}
		
			for (int row = 0; row <2; row++) {
				for (int col = 0; col < 3; col++) {
					System.out.print(" " + B [row] [col]);
				}
				System.out.println();
			}
		
	
		// closing tag--------------------	
	}
}
