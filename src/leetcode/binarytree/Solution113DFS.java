package leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengjie on 2020/2/29.
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \    / \
 *         7    2  5   1
 *
 */
public class Solution113DFS {


    public static void main(String[] args) {
        Solution113DFS solution113DFS=new Solution113DFS();
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
        System.out.println(solution113DFS.pathSum(b1,22));
    }
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(root,ans,new ArrayList<Integer>(),sum);
        return ans;

    }
    public void dfs(TreeNode root, List<List<Integer>> res, List<Integer> temp, int sum){
        if(root == null)
            return;
        temp.add(root.val);
        if(root.left == null && root.right == null && sum == root.val){
            res.add(new ArrayList<>(temp));
        }
        //temp.add(root.val);
        dfs(root.left, res, temp, sum - root.val);
        dfs(root.right, res, temp, sum - root.val);
        temp.remove(temp.size() - 1);
    }
}
