package week_01;

public class Array_03 {

	public static void main(String[] args) {

		// use of for_each loop

		int[] num = { 10, 20, 30, 40, 48, 49, 100 };
		int sum = 0;

		for (int x : num) {
			sum = sum + x;
		}

		System.out.println(sum);

	}

}
