package methodsHW;

import java.util.Scanner;
import java.lang.Math;

public class three {
    public static double printPower(int x,int n){
        return (Math.pow(x, n));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x: ");
        int x = sc.nextInt();
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();

        double pow = printPower(x, n);
        System.out.println(pow);
    }
}
