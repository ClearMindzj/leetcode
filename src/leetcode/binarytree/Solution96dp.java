package leetcode.binarytree;

/**
 * Created by zhengjie on 2020/2/24.
 * 96动态规划
 */
public class Solution96dp {
    public static void main(String[] args) {
        Solution96dp solution96dp=new Solution96dp();
        System.out.println(solution96dp.numTrees(3));
    }
    public int numTrees(int n) {
        int[] dp=new int[n+1];
        dp[0]=1;
        if(n==0){
            return 0;
        }
        //长度为1到n
        for (int i = 1; i <=n ; i++) {
            //将不同数字作为根节点.dp[3]就是求出以1为根节点+以2为根节点+以3为根节点。
            for(int root=1;root<=i;root++) {
                int left = root - 1;
                int right = i- root    ;
                dp[i] += dp[left] * dp[right];
            }
        }
        return dp[n];
    }
}
