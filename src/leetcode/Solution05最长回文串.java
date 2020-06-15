package leetcode;

/**
 * Created by zhengjie on 2019/12/19.
 */
public class Solution05最长回文串 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
    public static String longestPalindrome(String s) {
        int st=1,end=1;
        int len=s.length();
        if(len<=1) return s;
        boolean[][] a=new boolean[len+1][len+1];
        for(int i=1;i<=len;i++){
               a[i][i]=true;
        }
        for(int i=1;i<=len;i++){
            for(int j=1;j<i;j++){
                if(j+1==i){
                    a[j][i]=s.charAt(j-1)==s.charAt(i-1)?true:false;
                }else {
                    a[j][i]=s.charAt(j-1)==s.charAt(i-1)&&a[j+1][i-1];
                }
                if(a[j][i]&&i-j>end-st){
                    st=j;
                    end=i;
                }

            }
        }
        return s.substring(st-1,end);
    }
}
