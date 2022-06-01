package GroupProject;

public class OddEven2D {
	public static void main(String[] args) {
		/*
		 * Create a 2D array of integer type where you will store odd and even numbers.
		 * Develop a program which will identify/print the even numbers only.
		 */
		int[][] numbers = { { 2, 4, 6, 8, 10 }, { 1, 3, 5, 7, 9 } };
		
		for(int[] num:numbers) {
			for(int n:num) {
				if(n%2==0) {
				System.out.println(n);
				}
			}
		}

	}

}
