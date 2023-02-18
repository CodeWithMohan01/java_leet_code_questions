package Array;

// package Array;

import java.util.Arrays;
import java.util.Scanner;

// import javax.security.sasl.SaslException;

public  class swapeElement{
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 45, 56, 67, 78, 89, 90};
        System.out.println(Arrays.toString(arr));
        System.out.println("enter the indexes which you want to swap: ");
        Scanner in = new Scanner(System.in);
        int indx1 = in.nextInt();
        int indx2 = in.nextInt();
        swap(arr, indx1, indx2); 
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int indx1, int indx2){
        int temp;
        temp = arr[indx1];
        arr[indx1] = arr[indx2];
        arr[indx2] = temp;
    }
}
