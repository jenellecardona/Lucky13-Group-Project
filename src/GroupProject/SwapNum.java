package GroupProject;

public class SwapNum {
	public static void main(String[] args) {
		/*
		 * Write a program to swap 2 numbers without a temporary variable?
		 * 
		 */

		int a = 12;
		int b = 5;

		for (int i = a; i >= 5; i--) {
			a = i;
		}
		for (int j = b; j <= 12; j++) {
			b = j;
		}
		System.out.println("The Value of a = " + a + " and the value of b = " + b);

	}

}
