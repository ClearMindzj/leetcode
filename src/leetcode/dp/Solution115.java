package leetcode.dp;

/**
 * Created by zhengjie on 2020/3/6.
 * 不同的子序列
 */
public class Solution115 {
    public static void main(String[] args) {
        Solution115 solution115=new Solution115();
        String s="rabbbit";
        String t="rabbit";
        System.out.println(solution115.numDistinct(s,t));
    }
    public int numDistinct(String s, String t) {
          int m=s.length();
          int n=t.length();
          int[][] dp=new int[m+1][n+1];
        for (int i = 0; i <=m ; i++) {
            dp[i][0]=1;
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                //如果这个位置字符相等，那么s串的这个位置可以选也可以不选。选择，不选。
                if(s.charAt(j-1)==t.charAt(i-1)){
                    dp[j][i]=dp[j-1][i-1]+dp[j-1][i];
                }else {
                    dp[j][i]=dp[j-1][i];
                }
            }
        }
     return dp[m][n];
    }
}
