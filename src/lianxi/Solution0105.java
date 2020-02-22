package lianxi;

/**
 * Created by zhengjie on 2020/2/22.
 */
public class Solution0105 {
    public static boolean oneEditAway(String first, String second) {
        int len=first.length()-second.length();
        if(len>1||len<-1){
            return false;
        }
        int count=1;
        for(int i=0, j=0;i<first.length()&&j<second.length();i++,j++){
            if(first.charAt(i)!=second.charAt(j)){
                 if(len>0){
                     j--;
                 }
                 if(len<0){
                     i--;
                 }
                 count--;
            }
        }
        if(count<0){
            return false;
        }
        return true;
    }
}
