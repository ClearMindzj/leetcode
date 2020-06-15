package huawei;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by zhengjie on 2020/4/8.
 */
public class Main计票统计 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int a=scanner.nextInt();
            Map<String,Integer> map=new LinkedHashMap<>();
            for (int i = 0; i <a ; i++) {
                String s1=scanner.next();
                map.put(s1,0);
            }
            int b=scanner.nextInt();
            int count=0;
            for (int i = 0; i <b ; i++) {
                String s2=scanner.next();
                if(map.containsKey(s2)){
                    map.put(s2,map.get(s2)+1);
                }else {
                    count++;
                }
            }
            for(String s:map.keySet()){
                System.out.println(s+" "+":"+" "+map.get(s));
            }

                System.out.println("Invalid :"+" "+count    );

        }
    }
}
