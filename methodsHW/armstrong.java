package methodsHW;

import java.util.Scanner;
//import java.lang.Math;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int temp = n;
        int r, sum = 0;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            sum = sum + (r * r * r);
        }
        if (temp == sum) {
            System.out.println("no is armstrong");
        } else {
            System.out.println("not armstrong");
        }

    }
}