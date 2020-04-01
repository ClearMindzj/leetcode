package commonsuanfa;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhengjie on 2020/3/17.
 */
public class _36进制加法 {
    static Character[] nums = { '0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z' };
    static List<Character> list = Arrays.asList(nums);

    public static void main(String[] args) {
        _36进制加法 s=new _36进制加法();
        String str1="1b";
        String str2="2l";
        String r=s.f(str1,str2);
        System.out.println(r);
    }
    public String f(String str1,String str2){
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        int i = s1.length - 1;
        int j = s2.length - 1;
        int temp = 0;// 进位
        StringBuilder sb = new StringBuilder();
        while (i >= 0 && j >= 0) {
            char c1 = s1[i];
            char c2 = s2[j];
            int index1 = list.indexOf(c1);
            int index2 = list.indexOf(c2);
            int sum = index1 + index2 + temp;
            if (sum >= 36) {
                temp = 1;
                sb.append(list.get(sum % 36));
            } else {
                temp=0;
                sb.append(list.get(sum));
            }
            i--;
            j--;
        }
        while (i >= 0) {
            int sum = list.indexOf(s1[i]) + temp;
            if (sum >=36) {
                temp = 1;
                sb.append(list.get(sum % 36));
            } else {
                temp=0;
                sb.append(list.get(sum));
            }
            i--;
        }
        while (j >= 0) {
            int sum = list.indexOf(s2[j]) + temp;
            if (sum >=36) {
                temp = 1;
                sb.append(list.get(sum % 36));
            } else {
                temp=0;
                sb.append(list.get(sum));
            }
            j--;
        }
        if(temp!=0){
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}
