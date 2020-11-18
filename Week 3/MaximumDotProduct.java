import java.util.*;

class MaximumDotProduct{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long[] a = new long[n];
        long[] b = new long[n];
        
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }
        
        long total=0;
        long k;
        for(int i = 0; i <n;i++){
            for(int j=0;j<n-1;j++){
                if(a[j]<a[j+1]){
                    k = a[j];
                    a[j] = a[j+1];
                    a[j+1] = k;
                }
                if(b[j]<b[j+1]){
                    k = b[j];
                    b[j] = b[j+1];
                    b[j+1] = k;
                }
            }
        }
        
        for(int i=0;i<n;i++){
            total = total + a[i]*b[i];
        }
        System.out.println(total);
    }
}