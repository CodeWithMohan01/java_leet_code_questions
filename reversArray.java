// package Array;

import java.util.Arrays;

public class reversArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("The given array is:");
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println();
        System.out.println("Reversed array is: ");
        System.out.println(Arrays.toString(arr));

    }
    public static void reverse(int[] arr){
        int start = 0, end = (arr.length-1);
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
