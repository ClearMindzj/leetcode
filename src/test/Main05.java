package test;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/4/8.
 */
public class Main05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int a=scanner.nextInt();
            String s=scanner.nextLine();
            for (int i = 0; i <a ; i++) {
                String s1=scanner.nextLine();
                int len=s1.length();
                boolean flag=true;
                for (int j = 0; j <len-1 ; j++) {
                    if(s1.charAt(j)!=getMi(s1.charAt(len-1-j))){
                       flag=false;
                       break;
                    }
                }
                if(flag){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }
        }
    }
    public static char getMi(char c){
        if(c=='1') return '1';
        if(c=='2')  return '5';
        if(c=='3')  return '8';
        if(c=='4')  return  '7';
        if(c=='5')  return '2';
        if(c=='6')  return  '9';
        if(c=='7')  return  '4';
        if(c=='8')  return  '3';
        if(c=='9')  return  '6';
        return '0';
    }
}
