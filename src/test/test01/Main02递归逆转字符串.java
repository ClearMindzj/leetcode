package test.test01;

/**
 * Created by zhengjie on 2020/4/9.
 */
public class Main02递归逆转字符串 {
    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        //递归出口
        if (s == null || s.length() <= 1) {
            return s;
        }
        //从第二个字符开始递归，最后加上首字符。
        return reverseString(s.substring(1)) + s.charAt(0);
    }
}
