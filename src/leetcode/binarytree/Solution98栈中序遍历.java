package leetcode.binarytree;

import java.util.Stack;

/**
 * Created by zhengjie on 2020/4/1.
 */
public class Solution98栈中序遍历 {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        long lastVal = Long.MIN_VALUE;

        while (!st.empty() || root != null) {
            while(root != null) {
                st.push(root);
                root = root.left;
            }
            root = st.pop();
            if (root.val <= lastVal) return false;
            lastVal = (long)root.val;
            root = root.right;
        }
        return true;
    }

}
