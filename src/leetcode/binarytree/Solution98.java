package leetcode.binarytree;

/**
 * Created by zhengjie on 2020/2/25.
 * 验证二叉搜索树
 */
public class Solution98 {
    public static void main(String[] args) {
        Solution98 solution98=new Solution98();
        TreeNode b1=new TreeNode(5);
        b1.left=new TreeNode(1);
        b1.right=new TreeNode(4);
        b1.right.left=new TreeNode(3);
        b1.right.right=new TreeNode(6);
        System.out.println(solution98.isValidBST(b1));
    }
    public boolean isValidBST(TreeNode root) {
        if(root==null||root.left==null&&root.right==null){
            return true;
        }
        if(isValidBST(root.left)){
            if(root.left!=null){
                int max=max(root.left);
                if(root.val<=max){
                    return false;
                }
            }
        }else{
            return false;
        }
        if(isValidBST(root.right)){
            if(root.right!=null){
                int min=min(root.right);
                if(root.val>=min){
                    return false;
                }
            }
        }else {
            return false;
        }
        return true;
    }

    public int max(TreeNode root){
        int max=root.val;
        while (root.right!=null){
            if(root.right.val>max){
                max=root.right.val;
            }
            root=root.right;
        }
        return max;
    }
    public int min(TreeNode root){
        int min=root.val;
        while (root.left!=null){
            if(root.left.val<min){
                min=root.left.val;
            }
            root=root.left;
        }
        return min;
    }


}
