package leetcode;

/**
 * Created by zhengjie on 2019/12/23.
 */
public class Solution409 {
    public static void main(String[] args) {

    }
    public static int longestPalindrome(String s) {
       char[] a=s.toCharArray();
       int[] c=new int[256];
       int palindrome = 0;
       for(char i:a){
           c[i]++;
       }
       for(int i:c){
         palindrome+=(i/2)*2;
       }
       if(palindrome<s.length()){
           palindrome++;
       }
       return palindrome;
    }
}
