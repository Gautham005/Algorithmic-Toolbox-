import java.util.Scanner;

public class Fibonacci {
	public static int FibList(int n) {
		if (n <= 1)
			return n;

		int a, b, c = 0;
		a = 0;
		b = 1;
		for (int i = 1; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(FibList(n));

		sc.close();
	}
}
