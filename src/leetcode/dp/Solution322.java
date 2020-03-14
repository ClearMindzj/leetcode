package leetcode.dp;

/**
 * Created by zhengjie on 2020/3/1.
 */
public class Solution322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        dp[0]=0;
            for(int i=1;i<=amount;i++){
                dp[i]=Integer.MAX_VALUE-1;
                for(int coin:coins){
                if(i-coin>=0){
                    dp[i]=Math.min(dp[i],dp[i-coin]+1);
                }
            }
        }
            return dp[amount]==Integer.MAX_VALUE-1?-1:dp[amount];
    }
}
