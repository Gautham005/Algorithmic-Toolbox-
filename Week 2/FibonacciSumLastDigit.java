import java.util.*;

class FibonacciSumLastDigit {

	public static long Periodic(long m) {
		long a = 0, b = 1, c = a + b;
		for (long i = 0; i < m * m; i++) {
			c = (a + b) % m;
			a = b;
			b = c;
			if (a == 0 && b == 1) {
				return i + 1;
			}
		}
		return 0;
	}

	public static long Solve(long n, long m) {
		long remainder = n % Periodic(m);

		long first = 0;
		long second = 1;

		long res = remainder;

		for (long i = 1; i < remainder; i++) {
			res = (first + second) % m;
			first = second;
			second = res;
		}
		long k = res % m;
		return k;
	}

	// Sum Of (Fib[0]+Fib[1]+.....+Fib[n]) = Fib[n+2]-Fib[2]
	public static long Huge_Fibonacci(long n) {
		long Last_Digit_Of_nPlus2 = Solve(n + 2, 10);
		long Last_Digit_Of_2 = Solve(2, 10);

		if (Last_Digit_Of_nPlus2 >= Last_Digit_Of_2) {
			return (Last_Digit_Of_nPlus2 - Last_Digit_Of_2);
		} else {
			return ((10 + Last_Digit_Of_nPlus2) - Last_Digit_Of_2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println(Huge_Fibonacci(n));
		sc.close();
	}
}