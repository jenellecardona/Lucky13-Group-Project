package GroupProject;

public class SumEvenOdd {
	public static void main(String[] args) {
		/*Create a 2D array of integers
		 * Develop a program which will calculate the sum of  even and odd numbers for that array.
		 */

		int[][] numbers = { { 2, 14, 26, 38, 100 }, { 13, 33, 45, 57, 79 } };
		int sumEven=0;
		int sumOdd=0;

		for (int[] num : numbers) {
			for (int n : num) {
				if (n % 2 == 0) {
					sumEven+=n;
				}
				else if(n%2!=0) {
						sumOdd+=n;
					}
				}
			}
		System.out.println("The sum of all even numbers is "+sumEven);
		System.out.println("The sum of all odd numbers is "+sumOdd);
		}
	}


