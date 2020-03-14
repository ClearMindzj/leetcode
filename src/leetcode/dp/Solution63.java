package leetcode.dp;

/**
 * Created by zhengjie on 2020/3/4.
 */
public class Solution63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
       int[][] dp=new int[m+1][n+1];
        for (int i = 1; i <=m ; i++) {
            if(obstacleGrid[i-1][0]==1){
                dp[i][1]=0;
                break;
            }else {
                dp[i][1]=1;
            }
        }
        for (int i = 1; i <=n ; i++) {
            if(obstacleGrid[0][i-1]==1){
                dp[1][i]=0;
                break;
            }else {
                dp[1][i]=1;
            }
        }
        for (int i = 2; i <=m ; i++) {
            for (int j = 2; j <=n ; j++) {
                if(obstacleGrid[i-1][j-1]==1){
                    dp[i][j]=0;
                }else {
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m][n];
    }
}
