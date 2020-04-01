package leetcode.binarytree;

/**
 * Created by zhengjie on 2020/4/1.
 */
public class Solution98前序验证二叉搜索树 {
    public boolean isValidBST(TreeNode root) {
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    boolean dfs(TreeNode node, long lower, long upper) {
        if (node == null)
            return true;
        if (node.val <= lower)
            return false;
        if (node.val >= upper)
            return false;
        if (!dfs(node.left, lower, node.val))
            return false;
        if (!dfs(node.right, node.val, upper))
            return false;
        return true;
    }


}
