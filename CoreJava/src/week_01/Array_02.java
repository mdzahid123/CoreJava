package week_01;

import java.util.Scanner;

public class Array_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double[] number = new double[5];
		double sum = 0;
		
		System.out.println("Enter 5 number : ");

		for (int i = 0; i< number.length; i++) { 
			number [i] = input.nextDouble();
		}
		
		for ( int i = 0; i < number.length; i++ ) {
			sum = sum + number[i]; 
			
			double ave = sum / number.length;
			
			System.out.println("the sum is : " + sum);
			System.out.println("the ave is : " + ave);
			
			double max = number[0]; 
			double min = number[0];
			for (int i1 = 1; i1 < 5; i1++)  // problem here // lecture 54 
			                           
			{
				if(max<number[i1]) {
					max =number[i1];
				}
				if (min> number[i1]) {
					min = number[i1];
				}
					
			}
			
			System.out.println("Maximum : " + max);
			System.out.println("minimum : " + min);
			
		}
	

		/*
		number[0] = input.nextDouble();
		number[1] = input.nextDouble();
		number[2] = input.nextDouble();
		number[3] = input.nextDouble();
		number[4] = input.nextDouble(); 

		sum = number[0] + number[1] + number[2] + number[3] + number[4];
		System.out.println("Sum is :" + sum); */
		
	}

}
