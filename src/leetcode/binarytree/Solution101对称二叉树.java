package leetcode.binarytree;

/**
 * Created by zhengjie on 2020/2/26.
 * 对称二叉树
 */
public class Solution101对称二叉树 {
    public boolean isSymmetric(TreeNode root) {
     if(root==null) return true;
     return isEqual(root.left,root.right);
    }
    public boolean isEqual(TreeNode t1,TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        if (t1.val != t2.val) return false;
        return isEqual(t1.left, t2.right) && isEqual(t1.right, t2.left);
    }
}
