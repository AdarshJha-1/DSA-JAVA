package Arrays.RunningSumof1dArray1480;

import java.util.Arrays;

public class RunningSumof1dArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];

        // O(n)
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                ans[i] = nums[i];
                continue;
            }
            ans[i] = ans[i - 1] + nums[i];
        }


        // O(n*n)  2 for loops
//        for(int i = 0; i < nums.length; i++){
//                int sum = 0;
//            for(int j = i; j >= 0; j--){
//                sum += nums[j];
//            }
//            ans[i] = sum;
//        }

        return ans;
    }
}
