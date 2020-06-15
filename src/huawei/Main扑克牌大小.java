package huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/4/6.
 */
public class Main扑克牌大小 {


    public static String poker = "345678910JQKA2jokerJOKER";
    public static void main(String[] args) throws Exception {
        Scanner jin = new Scanner(System.in);
        while(jin.hasNext()) {
            String s = jin.nextLine();
            if(s.contains("joker JOKER")) {
                System.out.println("joker JOKER");
            }else {
                String[] str = s.split("-");
                String[] left = str[0].split(" ");
                String[] right = str[1].split(" ");
                if(left.length == 4 && right.length != 4) {
                    System.out.println(str[0]);
                }else if(left.length != 4 && right.length == 4) {
                    System.out.println(str[1]);
                }else if(left.length == right.length) {
                    String larger = poker.indexOf(left[0]) > poker.indexOf(right[0]) ? str[0] : str[1];
                    System.out.println(larger);
                }else
                    System.out.println("ERROR");
                }
            }
        }

}
