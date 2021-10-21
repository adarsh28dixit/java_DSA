package arrays;

import java.util.Scanner;

//Java Program to Search an Element in an Array
public class gfg1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int[] marks = new int[size];
        for(int i=0; i<size; i++){
            marks[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        for(int i=0; i<marks.length; i++){
            if(marks[i] == x){
                System.out.println("present");
            } 
        }
    }
}
