import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Calculator {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int num1, num2, result=0, i=0, n;
            System.out.println("enter no of itration: ");
            n = in.nextInt();
            char op;
            while(i < n) {
                num1 = in.nextInt();
                op = in.next().trim().charAt(0);
                num2 = in.nextInt();
                if(op=='+') {
                    result = num1+num2;
                }
                else if(op=='-') {
                    result = num1-num2;
                }
                else if(op=='*') {
                    result = num1*num2;
                }
                else if(op=='/') {
                    result = num1/num2;
                }
                else if(op=='%') {
                    result = num1%num2;
                }
                else{
                    System.out.println("Operator wrong!");
                }

                System.out.println(result);
                i++;
            }
        }
}
