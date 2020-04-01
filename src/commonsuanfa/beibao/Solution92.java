package commonsuanfa.beibao;

/**
 * Created by zhengjie on 2020/3/7.
 * lintCode 92背包问题
 */
public class Solution92 {

    public static void main(String[] args) {
        int[] a={3,4,5,8};
        int[] b={2,3,5,7};
        Solution92 solution92=new Solution92();
        System.out.println(solution92.backPack(10,a));
        System.out.println(solution92.backPack(12,b));
    }
    //dp[i][j] 偷第i件物品时还剩余j容量
    public int backPack(int m, int[] A) {
        int n=A.length;
        int[][] dp=new int[n+1][m+1];
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                if(A[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-A[i-1]]+A[i-1]);
                }
            }
        }
        return dp[n][m];
    }
}
