package Demo;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/3/12.
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine();
        String[] ss1=s1.split(" ");
        System.out.println(s1);
        System.out.println(ss1[0]+ss1[1]);
    }
}
