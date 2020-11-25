import java.util.*;

class InsertionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] A = new int[n];

		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}

		int value, hole;

		for (int i = 0; i < n; i++) {
			value = A[i];
			hole = i;

			while (hole > 0 && A[hole - 1] > value) {
				A[hole] = A[hole - 1];
				hole = hole - 1;
			}
			A[hole] = value;

		}

		for (int i = 0; i < n; i++) {
			System.out.print(A[i] + " ");
		}
		sc.close();
	}
}