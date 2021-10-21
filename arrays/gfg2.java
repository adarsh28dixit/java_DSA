package arrays;
//Java Program to Find the Largest Element in an Array
public class gfg2 {
    public static void main(String[] args) {
        int[] marks = {34,56,28,78};
        int min = marks[0];
        int max = marks[0];
        for(int i=0; i<marks.length; i++){
            if(marks[i] < min){
                min = marks[i];
                
            }
            
        }
        System.out.println("the minimum no is :"+min);
        for(int i=0; i<marks.length; i++){
            if(marks[i] > max){
                max = marks[i];
            }
        }
        System.out.println("the max is :"+max);
    }
}
