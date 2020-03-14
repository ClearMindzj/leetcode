package leetcode.binarytree;

/**
 * Created by zhengjie on 2020/2/26.
 * 前序中序构造二叉树
 */
public class Solution105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
           return buildTreeHelp(preorder,0,preorder.length,inorder,0,inorder.length);
    }

    public  TreeNode buildTreeHelp(int[] preorder,int p_start,int p_end,int[] inorder,int i_start,int i_end){
       //如果前序没值就返回空
        if(p_start==p_end){
            return null;
        }
        //在中序遍历中找到根节点。
        int p_index=preorder[p_start];
        TreeNode root=new TreeNode(p_index);
        int i_index=0;
        for (int i=i_start;i<i_end;i++){
            if(p_index==inorder[i]){
                i_index=i;
                break;
            }
        }
        //左子树总数，根据这个数来拆分左右字数数目。
        int leftNum=i_index-i_start;
        //递归构造左子树
        root.left=buildTreeHelp(preorder,p_start+1,p_start+leftNum+1,inorder,i_start,i_index);
        //递归构造右子数
        root.right=buildTreeHelp(preorder,p_start+leftNum+1,p_end,inorder,i_index+1,i_end);
        return root;

    }
}
