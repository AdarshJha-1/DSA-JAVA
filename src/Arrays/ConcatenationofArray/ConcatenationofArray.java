package Arrays.ConcatenationofArray;

import java.util.Arrays;

public class ConcatenationofArray {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        int[] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];

        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];  // founded in leetcode discuss😗
        }


        // with double for loop

//        for(int i = 0; i < ans.length / 2; i++){
//            ans[i] = nums[i];
//        }
//        for(int i = ans.length/2 ; i < ans.length; i++){
//            ans[i] = nums[i - nums.length];
//        }
        return ans;
    }
}
