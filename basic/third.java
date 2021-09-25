import java.util.Scanner;

public class third {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 to add marks or 0 to stop");
        int n = sc.nextInt();
         switch(n){
             case 1:
             System.out.println("enter the marks of student:");
             int x = sc.nextInt();
             if(x>= 90){
                 System.out.println("this is good");
             }
             else if(89 >= x || x >= 60){
                System.out.println("this is also good");
             } else {
                 System.out.println("this is good as well");
             }
             break;
             case 0:
             System.out.println("thanku");
             break;
             default:
             System.out.println("invalid operation");
         }
    }
}
