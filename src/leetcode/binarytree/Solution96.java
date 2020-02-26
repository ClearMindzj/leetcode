package leetcode.binarytree;

/**
 * Created by zhengjie on 2020/2/24.
 * 超时
 */
public class Solution96 {
    public static void main(String[] args) {
        Solution96 solution96=new Solution96();
        System.out.println(solution96.numTrees(3));
    }
    public int numTrees(int n) {
       if(n==0){
           return 0;
       }
       return getAns(n);
    }
    public int getAns(int n) {
        int ans=0;
        if(n==0||n==1){
            return 1;
        }
        for (int i=1;i<=n;i++){
            int leftTree=getAns(i-1);
            int rightTree=getAns(n-i);
            ans+=leftTree*rightTree;
        }
        return ans;
    }
}
