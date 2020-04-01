package leetcode.binarytree;

/**
 * Created by zhengjie on 2020/3/3.
 */
public class Solution404左叶子之和 {
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
       if(root==null){
           return 0;
       }
       if(root.left!=null&&root.left.left==null&&root.left.right==null){
           sum+=root.left.val;
       }
       sumOfLeftLeaves(root.left);
       sumOfLeftLeaves(root.right);
       return  sum;
    }
}
