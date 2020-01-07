package leetcode;

/**
 * Created by zhengjie on 2019/12/21.
 */
public class Solution53 {
    public static void main(String[] args) {
        int[] nums={-2,-1};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int len=nums.length;
        int res=Integer.MIN_VALUE;
        int[] dp=new int[len+1];
        for(int i=1;i<=len;i++){
            dp[i]=Math.max(dp[i-1]+nums[i-1],nums[i-1]);
            res=Math.max(res,dp[i]);
        }
        return res;
    }
}
