package GroupProject;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		/*
		 * Write a java program to check whether a given number is prime or not?
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number below");
		int num = scan.nextInt();
		int b = 0;

		if (num > 1) {
			for (int a = 1; a <= num; a++) {
				if (num % a == 0) {
					b = b + 1;
				}
			}
			if (b == 2) {
				System.out.println(num + " is a prime number");
			} else {
				System.out.println(num + " is not a prime number");
			}
		}else {System.out.println(num + " is not a prime number");}
		scan.close();

	}
}