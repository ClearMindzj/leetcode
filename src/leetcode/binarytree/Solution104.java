package leetcode.binarytree;

/**
 * Created by zhengjie on 2020/2/26.
 */
public class Solution104 {
    public int maxDepth(TreeNode root) {
       if(root==null){
           return 0;
       }
       return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

}
