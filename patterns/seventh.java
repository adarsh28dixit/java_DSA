package patterns;

public class seventh {
    public static void main(String[] args) {
        int n=5;
       int i=n;
       while(i>=1){
           int j=1;
           while(j<=i){
               System.out.print(j+" ");
               j++;
           }
           System.out.println();
           i--;
       }
    }
}
