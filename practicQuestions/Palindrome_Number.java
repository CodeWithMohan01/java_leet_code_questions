// package practicQuestions;
import java.util.Scanner;

// leetcode problem:- Palindrome Number(level easy)

public class Palindrome_Number {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int flag = 0;
    String  temp = Integer.toString(num);
  
    System.out.println(temp.charAt(temp.length() - (1)));
    
    if(temp.length() == 1){
        flag =1;
        
    }

    for(int i=0; i < temp.length()/2; i++) {
        
        if(temp.charAt(i) == temp.charAt(temp.length() - (1+i))) {
            flag = 1;
        }
    }

    if(flag==1){
        System.out.println("true");
    } else {
        System.out.println("false");
    }
}    
}
