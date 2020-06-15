package leetcode.dp;

import leetcode.Solution53;

/**
 * Created by zhengjie on 2020/3/3.
 * 最大自序*/
public class Solution53最大连续子序和 {
    public static void main(String[] args) {
        Solution53最大连续子序和 solution53=new Solution53最大连续子序和();
        int[] a={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution53.maxSubArray(a));
    }
        public int maxSubArray(int[] nums) {
           int m=nums.length;
           int dp[]= new int [m+1];
           dp[1]=nums[0];
           int max=nums[0];
           for(int i=2;i<=m;i++){
               if(dp[i-1]>  0){
                   dp[i]=dp[i-1]+nums[i-1];
               }else {
                   dp[i]=nums[i-1];
               }
               max=Math.max(max,dp[i]);
           }
           return max;
        }

}
