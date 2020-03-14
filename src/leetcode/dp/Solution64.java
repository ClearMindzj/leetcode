package leetcode.dp;

/**
 * Created by zhengjie on 2020/3/3.
 * 最小路径和
 */
public class Solution64 {
    public static void main(String[] args) {
        Solution64 solution64=new Solution64();
        int[][] grid={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(solution64.minPathSum(grid));
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m+1][n+1];
        for (int i = 1; i <=m ; i++) {
            dp[i][1]=dp[i-1][1]+grid[i-1][0];
        }
        for(int i=1;i<=n;i++){
            dp[1][i]=dp[1][i-1]+grid[0][i-1];
        }
        for (int i = 2; i <=m ; i++) {
            for (int j=2;j<=n;j++){
                dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i-1][j-1];
            }
        }
        return dp[m][n];
    }
}
