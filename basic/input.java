import java.util.*;
public class input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of circle:");
        int a = sc.nextInt();
        double pi = 3.14;
        double area = pi*a*a;
        System.out.println("the area of circle is " + area);
    }
}
