package leetcode.mianshiti;

/**
 * Created by zhengjie on 2020/2/21.
 */
public class Solution0105 {
    public static boolean oneEditAway(String first, String second) {
        int len = first.length()-second.length();
        if (len>1||len<-1) {
            return false;
        }
        int count=1;
        for (int i = 0,j=0; i < first.length()&&j < second.length(); i++,j++) {
            if (first.charAt(i)!=second.charAt(j)) {
                if (len==1) { //second要不要添加一个字符
                    j--;
                }else if (len==-1) { //second要不要删除一个字符
                    i--;
                }
                count--;
            }
            if (count<0) {//最多编辑一次
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String first="pale";
        String second="ple";
        System.out.println(oneEditAway(first,second));
    }
}
