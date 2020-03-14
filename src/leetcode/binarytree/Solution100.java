package leetcode.binarytree;

/**
 * Created by zhengjie on 2020/2/27.
 * 相同的树
 */
public class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }
        if(p!=null&&q!=null&&p.val==q.val){
                return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }else {
            return false;
        }

    }

}
