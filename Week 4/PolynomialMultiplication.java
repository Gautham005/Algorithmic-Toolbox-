import java.util.*;

class PolynomialMultiplication{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] A = new int[n]; // Polynomial 1
        int[] B = new int[n]; // Polynomial 2
        
        for(int i=0; i<n;i++){
            A[i] = sc.nextInt();
        }
        
        for(int i=0; i<n;i++){
            B[i] = sc.nextInt();
        }
        
        int[] C = new int[2*n-1]; // Result
        
        for(int k=0;k<2*n-1;k++){
            C[k]=0;             // Intialize result by 0
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                C[i+j] = C[i+j] + A[i]*B[j];    // Calculate the product of 2 Polynomial
            }
        }
        
        for(int k=0;k<2*n-1;k++){
            System.out.println(C[k]);             // Print the result
        }
        
        sc.close(); // O(n^2)
    }
}