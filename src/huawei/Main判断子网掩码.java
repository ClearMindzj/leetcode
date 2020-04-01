package huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/3/27.
 */
public class Main判断子网掩码 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine();
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            if (s == null || s.length() == 0 || s1 == null || s1.length() == 0 || s2 == null || s2.length() == 0) {
                System.out.println(1);
                break;
            }
            boolean flag = false;
            String ss[] = s.split("\\.");
            String ss1[] = s1.split("\\.");
            String ss2[] = s2.split("\\.");
            for (int i = 0; i < ss.length; i++) {
                if (Integer.valueOf(ss[i]) < 0 || Integer.valueOf(ss[i]) > 255 || Integer.valueOf(ss1[i]) < 0 || Integer.valueOf(ss1[i]) > 255 || Integer.valueOf(ss2[i]) < 0 || Integer.valueOf(ss2[i]) > 255) {
                    System.out.println(1);
                    System.exit(0);
                }
            }
            for (int i = 0; i < ss.length; i++) {
                if ((Integer.valueOf(ss[i]) & Integer.valueOf(ss1[i])) == (Integer.valueOf(ss[i]) & Integer.valueOf(ss2[i]))) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(0);
            } else {
                System.out.println(2);
            }
        }
    }
}
