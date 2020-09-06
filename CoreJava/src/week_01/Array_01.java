package week_01;

public class Array_01 {

	public static void main(String[] args) {
		
		
		/*
		 > An Array is a collection of variable of the same data type. 
		 > declaring variable for string 10 numbers, 
		 > [] third  bracket with the data type 
		 */
		
		int[] num; 
		num = new int [5];
		
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		
		int sum = num[0] + num[1]+ num[2]+ num[3]+ num[4];
		System.out.println("Sum is :" + sum);
		
		
		int len = num.length;
		System.out.println("Array Size :" + len);
				
		
		
		
		
		
		
		

	}
}
