import java.util.*;

class MoneyChange{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int count = 0;
        
        count = count + n/10;
        count = count + (n%10)/5;
        count = count + (n%10)%5;
        
        System.out.println(count);
        
        sc.close();
    }
}