import java.util.*;

class BinarySearch {

	// Iterative
	public static int BinarySearchIterative(int[] A, int low, int high, int key) {
		int mid;

		while (low <= high) {
			mid = low + (high - low) / 2;
			if (A[mid] == key) {
				return mid;
			} else if (A[mid] < key) {
				low = mid + 1;
			} else if (A[mid] > key) {
				high = mid - 1;
			} else {
				return -1;
			}
		}
		return -1;
	}

	// Recursive
	public static int BinarySearchRecursive(int[] A, int low, int high, int key) {
		if (high < low) {
			return -1;
		}

		int mid = low + (high - low) / 2;

		if (key == A[mid]) {
			return mid;
		} else if (key < A[mid]) {
			return BinarySearchRecursive(A, low, mid - 1, key);
		} else {
			return BinarySearchRecursive(A, mid + 1, high, key);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}

		int m = sc.nextInt();
		int[] search = new int[m];
		for (int j = 0; j < m; j++) {
			search[j] = sc.nextInt();
		}

		int value = 0;

		for (int k = 0; k < m; k++) {

			value = BinarySearchRecursive(A, 0, n - 1, search[k]);
			System.out.print(value + " ");

		}
		sc.close();
	}
}