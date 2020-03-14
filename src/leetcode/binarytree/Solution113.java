package leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengjie on 2020/2/29.
 */
public class Solution113 {
    public static void main(String[] args) {
        TreeNode b1=new TreeNode(5);
        b1.left=new TreeNode(4);
        b1.right=new TreeNode(8);
        b1.left.left=new TreeNode(11);
        b1.left.left.left=new TreeNode(7);
        b1.left.left.right=new TreeNode(2);
        b1.right.left=new TreeNode(13);
        b1.right.right=new TreeNode(4);
        b1.right.right.right=new TreeNode(1);
        b1.right.right.left=new TreeNode(5);
        Solution113 solution113=new Solution113();
        System.out.println(solution113.pathSum(b1,22));
    }
    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        hasPathSumHelper(root, sum, new ArrayList<Integer>(), ans);
        return ans;
    }

    private void hasPathSumHelper(TreeNode root, int sum, ArrayList<Integer> temp, List<List<Integer>> ans) {
        // 到达叶子节点
        if (root.left == null && root.right == null) {
            if (root.val == sum) {
                temp.add(root.val);
                ans.add(new ArrayList<>(temp));
                temp.remove(temp.size() - 1);
            }
            return;
        }
        // 左孩子为 null
        if (root.left == null) {
            temp.add(root.val);
            hasPathSumHelper(root.right, sum - root.val, temp, ans);
            temp.remove(temp.size() - 1);
            return;
        }
        // 右孩子为 null
        if (root.right == null) {
            temp.add(root.val);
            hasPathSumHelper(root.left, sum - root.val, temp, ans);
            temp.remove(temp.size() - 1);
            return;
        }
        temp.add(root.val);
        hasPathSumHelper(root.right, sum - root.val, temp, ans);
        temp.remove(temp.size() - 1);

        temp.add(root.val);
        hasPathSumHelper(root.left, sum - root.val, temp, ans);
        temp.remove(temp.size() - 1);

    }
}
