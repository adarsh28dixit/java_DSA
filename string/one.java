//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
package string;


import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totchar = 0;

        String[] name = new String[n];
        for(int i=0; i<n; i++){
            name[i] = sc.next();
            totchar += name[i].length();
        }
        System.out.println(totchar);
        
        

    }
}
