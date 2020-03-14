package leetcode.binarytree;

/**
 * Created by zhengjie on 2020/2/28.
 */
public class Solution112 {
    public static void main(String[] args) {

    }
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        return hasPathSumHelp(root,sum);
    }
        public boolean hasPathSumHelp(TreeNode root,int sum){
            if (root == null) {
                return sum == 0;
            }
            if (root.left == null) {
                return hasPathSumHelp(root.right, sum - root.val);
            }
            if (root.right == null) {
                return hasPathSumHelp(root.left, sum - root.val);
            }

            return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
        }

    }
