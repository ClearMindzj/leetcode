package leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengjie on 2020/3/13.
 * 电话号码字母组合
 */
public class Solution17 {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        for (int i = 0; i <digits.length() ; i++) {
            ans=mul(ans,getList(digits.charAt(i)-'0'));
        }
         return ans;

    }
    //构造每个list
    public List<String> getList(int digit){
        String digitLetter[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        List<String> ans=new ArrayList<>();
        for (int i = 0; i <digitLetter[digit].length(); i++) {
            ans.add(digitLetter[digit].charAt(i)+"");
        }
        return ans;

    }
    //定义两个list想乘
    public List<String> mul(List<String> l1, List<String> l2) {
        List<String> ans=new ArrayList<>();
        if(l1.size()!=0&&l2.size()==0){
            return  l1;
        }
        if(l1.size()==0&&l2.size()!=0){
            return l2;
        }
        for (int i = 0; i <l1.size() ; i++) {
            for (int j = 0; j <l2.size() ; j++) {
                ans.add(l1.get(i)+l2.get(j));
            }
        }
        return ans;
    }

}
