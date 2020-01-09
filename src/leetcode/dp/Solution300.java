package leetcode.dp;

/**
 * Created by zhengjie on 2020/1/8.
 */
public class Solution300 {
    public static void main(String[] args) {
      int a[]={-2,-1};
        System.out.println(lengthOfLIS(a));
    }
    public static int lengthOfLIS(int[] nums) {
        if(nums.length<2) return nums.length;
        int[] dp = new int[nums.length + 1];
        int res=0;
        for (int i = 1; i <= nums.length; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 1; j < i; j++) {
                if (nums[j - 1] < nums[i - 1]) {
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
                res=Math.max(res,dp[i]);
            }

        }
        return res;
    }
}
