package arrays;

public class max {
    public static void main(String[] args) {
        int marks[] = {23,56,93,87,90};
        int max = marks[0];
        for(int i=0; i<marks.length; i++){
            if(marks[i] > max){
                max = marks[i];
            }
        }
        System.out.println(max);
    }
}
