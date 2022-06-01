package GroupProject;

public class Fibonacci {
	public static void main(String[] args) {
		int t1 = 0, t2 = 1;

		int terms = 10;

		for (int i = 1; i <= terms; ++i) {
			System.out.print(t1 + " ");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}

	}
}
