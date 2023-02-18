
import java.util.Arrays;
import java.util.Scanner;

// ****1929. Concatenation of Array****

public class contatenation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int n = nums.length;
        int[] ans = new int[2*n];
        Scanner in = new Scanner(System.in);

        for(int i=0; i<(n); i++){
            ans[i] = nums[i];
            ans[n+i] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
