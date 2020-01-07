package leetcode;

/**
 * Created by zhengjie on 2019/12/21.
 */
public class Solution62 {
    public static void main(String[] args) {

        System.out.println(uniquePaths(7,3));
    }
    public static int uniquePaths(int m, int n) {
       int[][] dp=new int[m+1][n+1];
       for(int i=1;i<=m;i++){
           for(int j=1;j<=n;j++){
               if(i==1||j==1){
                   dp[i][j]=1;
               }else{
                   dp[i][j]=dp[i-1][j]+dp[i][j-1];
               }

           }
       }
       return dp[m][n];
    }
}
