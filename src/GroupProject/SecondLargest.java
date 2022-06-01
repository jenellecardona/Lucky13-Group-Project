package GroupProject;

public class SecondLargest {
	public static void main(String[] args) {
		/*
		 * Write a java program to find the second largest number in the array
		 */
		int[] num = { 2, 17, 5, 20, 34, 1 };
		int max = 34;
		int max2 = 0;
		int min = 1;

		for (int i = 0; i < num.length; i++) {
			if (num[i] != max && num[i]>min) {
				max2=num[i];
			}
		}System.out.println("The second largest number is "+max2);
	}

}
