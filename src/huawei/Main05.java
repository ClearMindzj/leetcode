package huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/3/23.
 * 16进制转十进制
 */
public class Main05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int sum=0;
            String s=scanner.nextLine();
            String s1="0123456789ABCDEF";
            String s2=s.toUpperCase();
            for (int i = s2.length()-1; i >=0 ; i--) {
                  int a=s1.indexOf(s2.charAt(i))==-1?0:s1.indexOf(s2.charAt(i));
                  sum+=a*Math.pow(16,s2.length()-i-1);
            }
            System.out.println(sum);
        }
    }
}
