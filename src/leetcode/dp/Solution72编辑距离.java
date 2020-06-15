package leetcode.dp;

/**
 * Created by zhengjie on 2020/3/2.
 * 编辑距离
 */
public class Solution72编辑距离 {
    public static void main(String[] args) {
       Solution72编辑距离 solution72=new Solution72编辑距离();
        System.out.println(solution72.minDistance("prwxwvwbwrbzimabfkuelppjiibbbw","hehcuqxnngzenaynzhyyzodgyzwcixfpgwhbltdnjrthbscv"));
    }
        public int minDistance(String word1, String word2) {
            int m=word1.length();
            int n=word2.length();
            int[][] dp=new int[m+1][n+1];
            for (int i = 1; i <=m ; i++) {
                dp[i][0]=i;
            }
            for (int i = 1; i <=n ; i++) {
                dp[0][i]=i;
            }
            for(int i=1;i<=m;i++){
                for(int j=1;j<=n;j++){
                    if(word1.charAt(i-1)==word2.charAt(j-1)){
                        dp[i][j]=dp[i-1][j-1];
                    }else {
                        //删除，增加，替换
                        dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                    }
                }
            }
            return dp[m][n];
        }
}
