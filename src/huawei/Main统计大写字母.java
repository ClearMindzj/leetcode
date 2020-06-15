package huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/4/6.
 */
public class Main统计大写字母 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String s=scanner.nextLine();
            int count=0;
            for (int i = 0; i <s.length() ; i++) {
                if(Character.isUpperCase(s.charAt(i))){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
