package week_01;

public class Array2D {

	public static void main(String[] args) {

		/*
		 * > multi dimensional array > 2d array [][] > 3d array > 3 dimensional [][][]
		 * array > row and collum [2][3] [2]> row [3] > collum
		 */

		int[][] number = new int[2][3];

		number[0][0] = 10;
		number[0][1] = 20; // use of 2D array
		number[0][2] = 30;
		number[1][0] = 40;
		number[1][1] = 50;
		number[1][2] = 60;

		/*
		 * System.out.println(number [0][0]); 
		 * System.out.println(number [0][1]);
		 * System.out.println(number [0][2]);
		 * System.out.println(number [1][0]);
		 * System.out.println(number [1][1]); 
		 * System.out.println(number [1][2]);
		 */

		// lets do them in loop

		for (int row = 0; row < 2; row++) {
			for (int col = 0; col < 3; col++) {

				System.out.print("     " + number[row][col]);
			}

			System.out.println();
		}

		
	}
}
