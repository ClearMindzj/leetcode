package leetcode.math;

/**
 * Created by zhengjie on 2020/3/19.
 * 字符串转换整数
 */
public class Solution08 {
    public int myAtoi(String str) {
       int sign=1;
       int ans=0,pop=0;
       //代表是否开始转换数字
       boolean flag=false;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='-'&&!flag){
                sign=-1;
                flag=true;
                continue;
            }
            if(str.charAt(i)=='+'&&!flag){
                sign=1;
                flag=true;
                continue;
            }
            if(str.charAt(i)==' '&&!flag){
                continue;
            }
            if(str.charAt(i)-'0'>0&&str.charAt(i)-'0'<9){
                flag=true;
                pop=str.charAt(i)-'0';
                if (ans * sign > Integer.MAX_VALUE / 10 || (ans * sign == Integer.MAX_VALUE / 10 && pop * sign > 7))
                    return 2147483647;
                if (ans * sign < Integer.MIN_VALUE / 10 || (ans * sign == Integer.MIN_VALUE / 10 && pop * sign < -8))
                    return -2147483648;
                ans = ans * 10 + pop;
            } else {
                return ans * sign;
            }
        }
        return ans * sign;
    }

}
