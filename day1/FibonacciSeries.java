package week1.day1;

public class FibonacciSeries {
	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);

		int c;
		for (int i = 0; i < 6; i++) {

			c = a + b;
			a = b;
			b = c;
			System.out.println(c);

		}

	}

}