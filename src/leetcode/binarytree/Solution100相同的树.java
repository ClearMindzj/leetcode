package leetcode.binarytree;

/**
 * Created by zhengjie on 2020/2/27.
 * 相同的树
 */
public class Solution100相同的树 {
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

    public boolean isSameTree2(TreeNode p, TreeNode q) {
        if(p==null&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return isSameTree2(p.left,q.left)&&isSameTree2(p.right,q.right);
    }

}
