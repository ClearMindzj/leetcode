package huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/3/29.
 */
public class Main按字节截取字符串 {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str;
        int num;

        while (in.hasNext()) {
            str=in.next();
            num=in.nextInt();
            char[] arr=str.toCharArray();
            int temp=0;
            int i=0;
            while (temp <num) {
                if (arr[i] > 128) {
                    temp+=2;
                    if (temp<=num)
                        i++;
                }else {
                    temp++;
                    if (temp<=num)
                        i++;
                }
            }
            System.out.println(str.substring(0,i));

        }

        in.close();
    }
}
