package leetcode.dp;

/**
 * Created by zhengjie on 2020/3/4.
 * 整数拆分
 */
public class Solution343 {
    public static void main(String[] args) {
        Solution343 solution343=new Solution343();
        System.out.println(solution343.integerBreak(5));
    }
    public int integerBreak(int n) {
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        int[] dp = new int[n + 1];
        //dp[2]  dp[3]数值要做修改
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 4; i <= n; i++)
            for (int j = 1; j <= i; j++)
                dp[i] = Math.max(dp[i], j * dp[i - j]);
        return dp[n];
    }
}
