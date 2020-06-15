package huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/4/6.
 */
public class Main字符串密码截取 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String s=scanner.nextLine();
            String s1="";
            for (int i = 0; i <s.length() ; i++) {
                String s2=isPalid(s,i,i);
                String s3=isPalid(s,i,i+1);
                s1=s1.length()>s2.length()?s1:s2;
                s1=s1.length()>s3.length()?s1:s3;
            }
            System.out.println(s1.length());
        }
    }
    public static String isPalid(String s,int i,int j){
        int len=s.length();
        while (i>=0&&j<len&&s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return  s.substring(i+1,j);
    }
}
