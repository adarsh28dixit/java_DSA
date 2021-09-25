package methodsHW;

import java.util.Scanner;

public class four {
    public static void printNo(int n1, int n2){
        while(n1!=n2){
            if(n1>n2){
                n1 = n1-n2;
            } else {
                n2 = n2-n1;
            }
        }
        System.out.println(n2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        printNo(n1,n2);
    }
}
