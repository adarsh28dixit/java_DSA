package methods;

import java.util.Scanner;

public class factorial {
    public static void findFactorial(int n){
        int fact=1;
        for(int i=n; i>=1; i--){
            
            fact=fact*i;
        }
        System.out.print(fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n :");
        int n = sc.nextInt();
        findFactorial(n);
    }
}
