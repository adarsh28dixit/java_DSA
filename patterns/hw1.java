package patterns;

public class hw1 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            //first inner loop
            for(int j=i; j<=(n-1); j++){
                System.out.print("  ");
            }

            //second inner loop
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }

            //third inner loop
            for(int j=1; j<=(n-5); j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}
