import java.util.*;

class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] A = new int[n];

		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}

		int temp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (A[j] > A[j + 1]) {
					temp = A[j + 1];
					A[j + 1] = A[j];
					A[j] = temp;
					continue;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(A[i] + " ");
		}
		sc.close();
	}
}