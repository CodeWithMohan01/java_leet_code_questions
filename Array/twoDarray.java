package Array;

import java.util.Arrays;
import java.util.Scanner;

public class twoDarray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
        System.out.println(("enter array elements: "));
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(("you entered this 2d array: "));
        // System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
