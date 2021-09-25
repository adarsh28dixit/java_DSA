import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner sc =  new Scanner (System.in);
        System.out.println("enter two no:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int divide = a / b;
        int mod = a % b;
        System.out.println("choose the operation:\n1:Addition\n2:Subtraction\n3:Multiplication\n4:Division\n5:Modulous");
        int x = sc.nextInt();
        switch(x){
            case 1:
            System.out.println("sum: " + sum);
            break;
            case 2:
            System.out.println("subtraction: " + sub);
            break;
            case 3:
            System.out.println("multiplication: " + mul);
            break;
            case 4:
            System.out.println("division: " + divide);
            break;
            case 5:
            System.out.println("modulous: " + mod);
            break;
            default:
            System.out.println("Invalid operation");
        }
    }
}
