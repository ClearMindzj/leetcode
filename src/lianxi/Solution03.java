package lianxi;

/**
 * Created by zhengjie on 2019/12/22.
 */
public class Solution03 {
    public static void main(String[] args) {
        System.out.println();

    }
    public static  int lengthOfLongestSubstring(String s) {
        int len=s.length();
        if(len==0)return  0;
        int pre=0,max=0;
        int[] hash=new int[128];
        for(int i=0;i<len;i++){
            if(hash[s.charAt(i)]>pre){
                pre=hash[s.charAt(i)];
            }
                hash[s.charAt(i)]=i+1;
                int l=i-pre+1;
                max=Math.max(l,max);

        }
        return max;
    }
}
