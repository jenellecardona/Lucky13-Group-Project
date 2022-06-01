package GroupProject;

public class Array2D {
	public static void main(String[] args) {
		/*
		 * Create a 2D array of integer values. Print the sum of all numbers
		 */

		int[][] array = { { 5, 10, 15, 20, 25 }, { 3, 6, 9, 12, 15 } };
		int sum=0;
		
		for(int [] a:array) {
			for(int num:a) {
				sum+=num;
			}
		}System.out.println(sum);
		
	}

}
