package methods;

import java.util.Scanner;

public class even {
    public static void printEvenOdd(int n){
        if(n%2==0){
            System.out.println("even");
            return;
        } else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no: ");
        int n = sc.nextInt();

        printEvenOdd(n);
    }
}
