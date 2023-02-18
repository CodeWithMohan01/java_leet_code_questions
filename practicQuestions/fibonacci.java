// package practicQuestions;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p=1, i=0, count=1, next;
        while(count <= n){
            System.out.println(i + " ");
            next = p+i;
            p = i;
            i = next;
            count++;
        }

    }
}
