package huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/3/23.
 * 统计字符个数
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s2=scanner.nextLine();
        String s1=scanner.nextLine();
        String s=s2.toLowerCase();

        char[] c=s1.toCharArray();
        char c1=c[0];
        int count=0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)==c1){
                count++;
            }
        }
        System.out.println(count);
    }
}
