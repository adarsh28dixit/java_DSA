package arrays;

import java.util.Arrays;

public class swap{
    
    public static void main(String[] args){
        int marks[] = {23,56,47,87,90};
        int temp = marks[1];
        marks[1] = marks[4];
        marks[4] =  temp;
        System.out.println(Arrays.toString(marks));
    }
}