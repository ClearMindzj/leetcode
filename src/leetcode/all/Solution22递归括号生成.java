package leetcode.all;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengjie on 2020/6/7.
 */
public class Solution22递归括号生成 {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        backtrack(list,"",0,0,n);
        return list;
    }

    public void backtrack(List<String> list,String cur,int left,int right,int n){
        if(cur.length()==2*n){
            list.add(cur);
            return;
        }
        //左括号的数量不能大于n
        if(left<n){
            backtrack(list,cur+"(",left+1,right,n);
        }
        //右边括号数量不能超过左边
        if(right<left){
            backtrack(list,cur+")",left,right+1,n);
        }
    }
}
