//  Maximum Value of the Loot (Fractional Knapsack)

import java.util.*;

class FractionalKnapsack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int max = sc.nextInt();

		int[] val = new int[n];
		int[] cap = new int[n];
		double[] ratio = new double[n];

		for (int i = 0; i < n; i++) {
			val[i] = sc.nextInt();
			cap[i] = sc.nextInt();
			ratio[i] = (val[i] * 1.0) / (cap[i] * 1.0);
			// System.out.println(ratio[i]);
		}
		int a;
		double b;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (ratio[j] < ratio[j + 1]) {
					b = ratio[j];
					ratio[j] = ratio[j + 1];
					ratio[j + 1] = b;

					a = val[j];
					val[j] = val[j + 1];
					val[j + 1] = a;

					a = cap[j];
					cap[j] = cap[j + 1];
					cap[j + 1] = a;
				}
			}
		}
		double count = 0;
		for (int i = 0; i < n; i++) {

			if (cap[i] <= max) {
				max = max - cap[i];
				count = count + val[i];
			} else {
				double d = cap[i] * 1.0 / max;
				count = count + val[i] / d;
				break;
			}
		}
		System.out.printf("%.4f", count);
		sc.close();
	}
}