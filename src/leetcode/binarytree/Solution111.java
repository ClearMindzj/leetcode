package leetcode.binarytree;

/**
 * Created by zhengjie on 2020/2/29.
 * 二叉树最小深度
 */
public class Solution111 {
    public int minDepth(TreeNode root) {
        //递归出口
         if(root==null){
             return 0;
         }
         //如果左孩子为空
         if(root.left==null){
             return minDepth(root.right)+1;
         }
         //右孩子为空
         if(root.right==null){
             return minDepth(root.left)+1;
         }
         //左右孩子都存在
         return Math.min(minDepth(root.left),minDepth(root.right))+1;
    }
}
