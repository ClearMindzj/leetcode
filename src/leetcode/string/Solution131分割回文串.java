package leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengjie on 2020/4/3.
 */
public class Solution131分割回文串 {
    public List<List<String>> partition(String s) {
       List<List<String>> lists=new ArrayList<>();
       lists=dfs(s,0,new ArrayList<String>(),lists);
       return lists;
    }
    public List<List<String>> dfs(String s,int start,List<String> list,List<List<String>> lists){
        if(start==s.length()){
            lists.add(new ArrayList<>(list));
        }
        //从第一开始，截取长度为1，2，3.....递归回溯下一个字符
        for (int i = start; i <s.length() ; i++) {
            String s1=s.substring(start,i+1);
            //是回文串就加进去，不是就跳过
            if(!isPalindrome(s1)) continue;
            list.add(s1);
            dfs(s,i+1,list,lists);
            list.remove(list.size()-1);
        }
        return lists;
    }
    public boolean isPalindrome(String s){
       int a=0;int b=s.length()-1;
       while (a<b){
           if(s.charAt(a)==s.charAt(b)){
               a++;
               b--;
               continue;
           }else {
               return false;
           }
       }
       return true;
    }
}
