package leetcode.binarytree;

/**
 * Created by zhengjie on 2020/2/28.
 * 有序数组转化为二叉搜索树
 */
public class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }
        return sortedArrayToBSTHelp(nums,0,nums.length-1);
    }
    public TreeNode sortedArrayToBSTHelp(int[]nums,int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=sortedArrayToBSTHelp(nums,start,mid-1);
        root.right=sortedArrayToBSTHelp(nums,mid+1,end);
        return root;
    }
}
