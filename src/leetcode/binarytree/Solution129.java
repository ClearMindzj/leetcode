package leetcode.binarytree;

/**
 * Created by zhengjie on 2020/2/29.
 */
public class Solution129 {
    int sum=0;
    public int sumNumbers(TreeNode root) {
        if(root==null){
            return 0;
        }
        dfs(root,root.val);
        return sum;
    }
    public void dfs(TreeNode root,int val){
        if(root.left==null&&root.right==null){
            sum+=val;
            return;
        }
        //尝试左子树
        if(root.left!=null){
            dfs(root.left,val*10+root.left.val);
        }
        if(root.right!=null){
            dfs(root.right,val*10+root.right.val);
        }
    }

}
