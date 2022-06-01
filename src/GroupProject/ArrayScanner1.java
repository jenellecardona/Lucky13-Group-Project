package GroupProject;

import java.util.Scanner;

public class ArrayScanner1 {
	public static void main(String[] args) {
		/*
		 * Using Scanner create an array of integer values. 
		 * After the array is created, calculate the sum of all stored elements in that array.
		 */
		
		Scanner scan=new Scanner(System.in);
		
		int[] numbers= new int[4];
		int sum=0;
		
		for(int n=0; n<numbers.length; n++) {
		System.out.println("Enter a number");
		numbers[n]=scan.nextInt();}
		for(int num=0; num<numbers.length; num++) {
		sum+=numbers[num];
		}System.out.println(sum);
			scan.close();
		
		}
		
	}


