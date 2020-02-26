package leetcode.binarytree;

/**
 * Created by zhengjie on 2020/2/26.
 */
public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
     if(root==null) return true;
     return isEqual(root.left,root.right);
    }
    public boolean isEqual(TreeNode left,TreeNode right){
        if(left==null&&right!=null||left!=null&&right==null){
            return false;
        }
        if(left!=null&&right!=null){
            if(left.val!=right.val){
                return false;
            }
            return isEqual(left.left,right.right)&& isEqual(left.right,right.left);
        }
        return true;
    }

}
