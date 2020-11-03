import java.util.Scanner;
public class GCD {
	/*
	 * 
	 * GCD(a,b) = GCD(a1,b) = GCD(b,a1) Where a1 -> Remainder when a is divided by b
	 * 
	 * a = a1 + bq So, a/d = a1/d + bq/d
	 * 
	 * Where q is some integer
	 * 
	 */
	
	public static int EuclidGCD(int a, int b) {
		if (b == 0)
			return a;

		int a1 = a % b;
		return EuclidGCD(b, a1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // Number 1
		int b = sc.nextInt(); // Number 2
		if (a >= b) {
			System.out.println(EuclidGCD(a, b));
		} else {
			System.out.println(EuclidGCD(b, a));
		}
		
		sc.close();
	}
}
