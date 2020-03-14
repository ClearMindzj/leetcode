package leetcode.binarytree;

/**
 * Created by zhengjie on 2020/2/28.
 * 判断是否为平衡二叉树
 */
public class Solution110 {
    public boolean isBalanced(TreeNode root) {
       return isBalancedHelp(root);
    }
    public boolean isBalancedHelp(TreeNode root){
        if(root==null){
            return true;
        }
        int leftDep=depMax(root.left);
        int rightDep=depMax(root.right);
        if(Math.abs(leftDep-rightDep)>1){
            return false;
        }else {
            return isBalancedHelp(root.left)&&isBalancedHelp(root.right);
        }
    }
    public int depMax(TreeNode node){
        if(node==null){
            return 0;
        }else {
            return Math.max(depMax(node.left),depMax(node.right))+1;
        }
    }
}
