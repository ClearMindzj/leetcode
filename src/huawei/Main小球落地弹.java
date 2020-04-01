package huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/3/28.
 */
public class Main小球落地弹 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int a=scanner.nextInt();
            double c=a;
            double b=0;
            for (int i = 0; i <4 ; i++) {
                b+=c;
                c=c/2;
                b+=c;
            }
            b+=c;
            System.out.println(b);
            System.out.println(c/2);
        }
    }
}
