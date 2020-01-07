package leetcode;

/**
 * Created by zhengjie on 2019/12/23.
 */
public class Solution205 {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("paper","title"));

    }
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()==0)return true;
        int i=0;
        while(i<s.length())
        {
            if(s.indexOf(s.charAt(i))!=t.indexOf(t.charAt(i)))
                return false;
            i++;
        }
        return true;
    }
}
