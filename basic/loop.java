import java.util.Scanner;



public class loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        while(i <= n){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
