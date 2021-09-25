package methods;

import java.util.Scanner;

public class sum {
    public static int sumNumber(int a,int b){
        int add =a+b;
        return add;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int add = sumNumber(a, b);
            System.out.println("sum of two no :"+add);
    }
}
