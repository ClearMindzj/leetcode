package huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/3/23.
 *字符串最后一个单词长度
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String s1=new StringBuilder(s).reverse().toString();
        int count=0;
        for (int i = 0; i <s1.length() ; i++) {
            if(s1.charAt(i)!=' '){
                count++;
            }else {
                break;
            }
        }
        System.out.println(count);
    }
}
