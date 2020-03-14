package leetcode.binarytree;

import java.util.Stack;

/**
 * Created by zhengjie on 2020/2/29.
 */
public class Solution112DFS  {
    public static void main(String[] args) {
        Solution112DFS solution112DFS=new Solution112DFS();
        TreeNode b1=new TreeNode(3);
        b1.left=new TreeNode(9);
        b1.right=new TreeNode(20);
        b1.left.right=new TreeNode(15);
        b1.left.left=new TreeNode(8);
        System.out.println(solution112DFS.hasPathSum(b1,27));
    }
    public boolean hasPathSum(TreeNode root, int sum) {
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> stackSum = new Stack<>();
        TreeNode cur = root;
        int curSum = 0;
        while (cur != null || !stack.isEmpty()) {
            // 节点不为空一直压栈
            while (cur != null) {
                stack.push(cur);
                curSum += cur.val;
                stackSum.push(curSum);
                cur = cur.left; // 考虑左子树
            }
            // 节点为空，就出栈
            cur = stack.pop();
            curSum = stackSum.pop();
            //判断是否满足条件
            if (curSum == sum && cur.left == null && cur.right == null) {
                return true;
            }
            // 考虑右子树
            cur = cur.right;
        }
        return false;
    }
}
