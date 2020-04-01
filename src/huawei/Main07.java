package huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/3/23.
 * 字符逆序
 */
public class Main07 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        System.out.println(new StringBuilder(s).reverse().toString());
    }
}
