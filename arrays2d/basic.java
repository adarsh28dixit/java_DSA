package arrays2d;
import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows : ");
        int n = sc.nextInt();
        System.out.println("enter no of columns : ");
        int m = sc.nextInt();

        int [][] marksA = new int[n][m];
        int [][] marksB = new int[n][m];
        int [][] marksC = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                marksA[i][j] = sc.nextInt();

            }
           
        }
        System.out.println("second matrix");

        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                marksB[i][j] = sc.nextInt();

            }
            
        }

        //output
        System.out.println("sum is : ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                marksC[i][j] = marksA[i][j] + marksB[i][j];

            }
            System.out.println(marksC[i][j]);
        }
 
        
    }
}
