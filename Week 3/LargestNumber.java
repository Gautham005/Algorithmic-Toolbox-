import java.util.*;

// find the largest number which can be formed from the array of numbers
public class LargestNumber {

	public static int largest(int[] arr, int n) {
	    if(n==0){
	        return 0;
	    }
		int[] a = new int[n - 1];
		int m = arr[0];
		int k=0;
		for(int i=0;i<n-1;i++) {
			if(m<arr[i+1]) {
				m=arr[i+1];
				k=i+1;
			}
		}
		int j=0;
		for(int i=0;i<n;i++) {
			if(i!=k) {
				a[j++] = arr[i];
			}
		}
		System.out.print(m);
		return largest(a,n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the numbers:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Largest number from the combination is: ");
		largest(arr,n);
		sc.close();
	}
}
