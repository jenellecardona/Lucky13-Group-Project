package GroupProject;

import java.util.Scanner;

public class Countries {
	public static void main(String[] args) {
		/*
		 * Using Scanner create an array of countries. When an array is created,
		 * retrieve all values from it And while retrieving those values print capital
		 * for each country. (use 2 different loops).
		 */
		Scanner scan = new Scanner(System.in);

		String[] countries = new String[3];
		String[] capital = new String[3];

		for (int c = 0; c < 3; c++) {
			System.out.println("Enter country name");
			countries[c] = scan.nextLine();
			System.out.println("Enter its capital");
			capital[c] = scan.nextLine();
			System.out.println("The capitol of "+countries[c]+" is "+capital[c]);
		}
		int n=0;
		while(n<3) {
			System.out.println("Enter country name");
			countries[n] = scan.nextLine();
			System.out.println("Enter its capital");
			capital[n] = scan.nextLine();
			System.out.println("The capitol of "+countries[n]+" is "+capital[n]);
			n++;
		}
	
		scan.close();

	}
}
