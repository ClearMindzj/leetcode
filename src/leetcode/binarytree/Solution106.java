package leetcode.binarytree;

/**
 * Created by zhengjie on 2020/2/26.
 */
public class Solution106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
       return buildTreeHelp(inorder,0,inorder.length,postorder,0,postorder.length);
    }
    public  TreeNode buildTreeHelp(int[] inorder,int i_start,int i_end,int[] postorder,int p_start,int p_end){
        if (p_start==p_end){
            return null;
        }
        //找到根节点构造
        int p_root=postorder[p_end-1];
        TreeNode root=new TreeNode(p_root);
        //在中序遍历中找到根节点索引
        int p_root_index=0;
        for(int i=i_start;i<i_end;i++){
          if(p_root==inorder[i]){
              p_root_index=i;
              break;
          }
        }
        int leftNum=p_root_index-i_start;
        //递归构造左子树
        root.left=buildTreeHelp(inorder,i_start,p_root_index,postorder,p_start,p_start+leftNum);
        //递归构造右子数
        root.right=buildTreeHelp(inorder,p_root_index+1,i_end,postorder,p_start+leftNum,p_end-1);
        return root;
    }
}
