package basic;

import java.util.Scanner;

public class prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no:");
        int n = sc.nextInt();
        for (int j = 1; j <= n; j++) {
            int temp = 0;
            for (int i = 2; i <= (j - 1); i++) {
                if (j % i == 0) {
                    temp += 1;
                }
            }
            if (temp == 0) {
                System.out.println(j);
            }

        }
    }
}
