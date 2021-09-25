package methodsHW;

import java.util.Scanner;

public class one {

    public static float printAverage(int a,int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no: ");
        int a = sc.nextInt();
        System.out.println("enter second no: ");
        int b = sc.nextInt();
        System.out.println("enter third no: ");
        int c = sc.nextInt();

        float av = printAverage(a, b, c);
        System.out.println("average of three no is: "+av);
    }
}
