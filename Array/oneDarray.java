package Array;

import java.util.Arrays;
import java.util.Scanner;

public class oneDarray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner in = new Scanner(System.in);

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("You enter elements: ");
        System.out.println(Arrays.toString(arr));
    }
}
