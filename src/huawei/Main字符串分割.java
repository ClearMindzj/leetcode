package huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/3/23.
 *
 */
public class Main字符串分割 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();
        if(s1.length()<=8){
            int m=8-s1.length();
            for (int i = 0; i <m ; i++) {
                s1=s1+0;
            }
            System.out.println(s1);
        }
        if(s1.length()>8){
            int a=s1.length()/8;
            int b=s1.length()%8;
            for (int i = 0; i <a ; i++) {
                System.out.println(s1.substring(8*i,8*i+8));
            }
            if(b>0){
               String temp=s1.substring(8*a,8*a+b);
                for (int i = 0; i <8-b ; i++) {
                    temp=temp+0;
                }
                System.out.println(temp);
            }
        }
        if(s2.length()<=8){
            int m=8-s2.length();
            for (int i = 0; i <m ; i++) {
                s2=s2+0;
            }
            System.out.println(s2);
        }
        if(s2.length()>8){
            int a=s2.length()/8;
            int b=s2.length()%8;
            for (int i = 0; i <a ; i++) {
                System.out.println(s2.substring(8*i,8*i+8));
            }
            if(b>0){
                String temp=s2.substring(8*a,8*a+b);
                for (int i = 0; i <8-b ; i++) {
                    temp=temp+0;
                }
                System.out.println(temp);
            }
        }




    }
}
