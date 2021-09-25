package recursion;

public class factorial {
    public static void printFactorial(int i, int n, int fact){
        if(i==n){
            fact *= n;
            System.out.println(fact);
            return;
        }
        fact *= i;
        printFactorial(i+i, n, fact);
    }
    public static void main(String[] args) {
        printFactorial(1, 5, 1);
    }
}
