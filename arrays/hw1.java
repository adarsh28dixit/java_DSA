package arrays;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        String names[] = new String[size];
        
        for(int i=0; i<size; i++){
            names[i] = sc.nextLine();

        }

        //output
        for(int j=0; j<names.length; j++){
            System.out.print(names[j]+" ");
        }
        
    }
}
