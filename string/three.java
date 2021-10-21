package string;

import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        System.out.println(email);
        String update = "";
        for(int i=0; i<email.length(); i++){
            if(email.charAt(i) == '@'){
                break;
            } else {
                update += email.charAt(i);
            }
        }
        System.out.println(update);
    }
}
