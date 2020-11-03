import java.util.Scanner;

public class Pairwise{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int result1 = -1;
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (result1 == -1 || a[i] > a[result1]) {
				result1 = i;
			}
		}

		int result2 = -1;
		for (int j = 0; j < n; j++){
		    try{
			if ((result2 == -1 && j != result1) || (a[j] > a[result2] && j!=result1)) {
				result2 = j;
			}
		    }catch(Exception e){
		        continue;
		    }
		}

		long result = (long) a[result1] * a[result2];

		System.out.println(result);

		sc.close();
	}

}
