package leetcode.string;

/**
 * Created by zhengjie on 2020/3/2.
 * 最长回文 */
public class Solution05最长回文串 {

    public static void main(String[] args) {
        Solution05最长回文串 solution05=new Solution05最长回文串();
        String s="aab";
        System.out.println(solution05.longestPalindrome(s));
    }
    public String longestPalindrome(String s) {
        String string="";
      for(int i=0;i<s.length();i++){
          String s1=expandAroundCenter(s,i,i);
          String s2=expandAroundCenter(s,i,i+1);
          string=string.length()>s1.length()?string:s1;
          string=string.length()>s2.length()?string:s2;
      }
      return string;
    }
    public  String expandAroundCenter(String s,int l,int r){
        while (l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
                l--;
                r++;
        }
        return s.substring(l+1,r);
    }
}
