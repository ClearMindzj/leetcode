package huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/4/8.
 */
public class Main表示数字 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String a=scanner.nextLine();
            StringBuilder sb=new StringBuilder();
            if(a.charAt(0)>='0'&&a.charAt(0)<='9'&&a.charAt(1)>='0'&&a.charAt(1)<='9'){
                sb.append("*");
                sb.append(a.charAt(0));
            }else if(a.charAt(0)>='0'&&a.charAt(0)<='9'&&(a.charAt(1)<'0'||a.charAt(1)>'9')){
                sb.append("*");
                sb.append(a.charAt(0));
                sb.append("*");
            }else {
                sb.append(a.charAt(0));
            }
            for (int i = 1; i <a.length()-1 ; i++) {
                if(a.charAt(i)>='0'&&a.charAt(i)<='9'&&(a.charAt(i-1)>'9'||a.charAt(i-1)<'0')&&(a.charAt(i+1)>'9'||a.charAt(i+1)<'0')){
                    sb.append("*");
                    sb.append(a.charAt(i));
                    sb.append("*");
                }
                else if(a.charAt(i)>='0'&&a.charAt(i)<='9'&&(a.charAt(i-1)>'9'||a.charAt(i-1)<'0')){
                    sb.append("*");
                    sb.append(a.charAt(i));
                }else if(a.charAt(i)>='0'&&a.charAt(i)<='9'&&(a.charAt(i+1)>'9'||a.charAt(i+1)<'0')){
                    sb.append(a.charAt(i));
                    sb.append("*");
                }else {
                    sb.append(a.charAt(i));
                }
            }
            if(a.charAt(a.length()-1)>'9'||a.charAt(a.length()-1)<'0'){
                sb.append(a.charAt(a.length()-1));
            }else
            if(a.charAt(a.length()-1)>='0'&&a.charAt(a.length()-1)<='9'&&a.charAt(a.length()-2)>='0'&&a.charAt(a.length()-2)<='9'){
                sb.append(a.charAt(a.length()-1));
                sb.append("*");
            }else if (a.charAt(a.length()-1)>='0'&&a.charAt(a.length()-1)<='9'&&(a.charAt(a.length()-2)<'0'||a.charAt(a.length()-2)>'9')){
                sb.append("*");
                sb.append(a.charAt(a.length()-1));
                sb.append("*");
            }
            System.out.println(sb.toString());
        }
    }

}
