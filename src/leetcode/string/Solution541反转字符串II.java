package leetcode.string;

/**
 * Created by zhengjie on 2020/3/31.
 */
public class Solution541反转字符串II {
    public String reverseStr(String s, int k) {

        int kk = k * 2;
        int N = s.length();
        char[] chars = s.toCharArray();

        for (int i = 0; i < N; i += kk) {
            if (i + kk < N ) {
                reverse(chars, i, i + k - 1); //加2k不越界
            } else if (i + k < N) {
                reverse(chars, i, i + k - 1); //加2k越界了，但当前位置后面够k个字符
            } else {
                reverse(chars, i, N-1);       //加k越界，直接翻转剩余字符
            }
        }
        return new String(chars);
    }
    //翻转方法
    private static char[] reverse (char[] arr, int begin, int end) {
        while (begin < end) {
            char c = arr[begin];
            arr[begin++] = arr[end];
            arr[end--] = c;
        }
        return arr;
    }


}
