import java.util.*;

class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] A = new int[n];

		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}

		int min_index, temp;
		for (int i = 0; i < n - 1; i++) {
			min_index = i;
			for (int j = i + 1; j < n; j++) {
				if (A[min_index] > A[j]) {
					min_index = j;
				}
			}

			temp = A[i];
			A[i] = A[min_index];
			A[min_index] = temp;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(A[i] + " ");
		}
		
		sc.close();
	}
}