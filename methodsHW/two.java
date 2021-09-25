package methodsHW;

import java.util.Scanner;

public class two {

    public static int printSum(int n){
        return (n*n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = printSum(n);
        System.out.println(sum);
    }
}
