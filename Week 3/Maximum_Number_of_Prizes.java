import java.util.*;

class Maximum_Number_of_Prizes{
    public static void maxPrice(int n) {
		int count = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			if (n - i > i) {
				n = n - i;
				count++;
				list.add(i);
			} else {
				list.add(n);
				count++;
				break;
			}
		}
		System.out.println(count);
		for (int l : list) {
			System.out.print(l + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		maxPrice(n);
		sc.close();
	}
}