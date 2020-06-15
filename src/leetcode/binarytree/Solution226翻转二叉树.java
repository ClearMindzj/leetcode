package leetcode.binarytree;

/**
 * Created by zhengjie on 2020/4/16.
 */
public class Solution226翻转二叉树 {
    public TreeNode invertTree(TreeNode root) {
        if (root==null){
            return null;
        }
        //保存右子树
        TreeNode rootLeft=root.right;
        //交换左右字数位置
        root.right=invertTree(root.left);
        root.left=invertTree(rootLeft);
        return root;

    }

}
