import java.util.Scanner;

public class LCM {
	/**
	 * If a and b are the numbers, then to find the LCM fast do the following:
	 * Find HCF(a,b);
	 * Divide by a and multiply by b
	 * or
	 * Divide by b and multiply by a
	 * 
	 */
	public static long EuclidGCD(long a, long b) {
		if (b == 0)
			return a;

		long a1 = a % b;
		return EuclidGCD(b, a1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong(); // Number 1
		long b = sc.nextLong(); // Number 2
		long c = 0;
		if (a >= b) {
			c = EuclidGCD(a, b);
		} else {
			c = EuclidGCD(b, a);
		}
		long d = 0;
		d = (a/c)*b;
        System.out.println(d);
		
		sc.close();
	}
}


