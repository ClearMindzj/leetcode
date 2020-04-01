package test;

import java.util.*;

/**
 * Created by zhengjie on 2020/3/24.
 */
public class Main01 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        List<Character> list=new ArrayList<>();
        for (int i = 0; i <s.length() ; i++) {
            if(list.contains(s.charAt(i))){
                continue;
            }else {
                list.add(s.charAt(i));
            }
        }
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i));
        }
    }
}
