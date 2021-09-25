package patterns;

public class eight {
    public static void main(String[] args) {
        int n=5;
        int no=1;
        for(int i=1; i<=n; i=i+1){
            for(int j=1; j<=i; j=j+1){
               
               System.out.print(no+" ");
               no++;
            }
            System.out.println();
        }
    }
}
