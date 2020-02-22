package leetcode.mianshiti;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhengjie on 2020/2/21.
 */
public class Solution0101 {
    public boolean isUnique(String astr) {
        Set<Character> set=new HashSet<Character>();
        for (int i = 0; i <astr.length() ; i++) {
            set.add(astr.charAt(i));
        }
        if(set.size()!=astr.length()){
            return  false;
        }
        else{
            return true;
        }
    }
}
