package huawei;

import java.util.*;

/**
 * Created by zhengjie on 2020/3/29.
 */
public class Main名字的漂亮度 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();

            String[] strings = new String[num];
            for (int i = 0; i < num; i++) {
                strings[i] = sc.nextLine();
            }

            for (int i = 0; i < num; i++) {
                HashMap<Character, Integer> map;
                List<Integer> list=new ArrayList<>();
                String str= strings[i].toLowerCase();
                map = getChTimes(str);
                for (Integer a :map.values()) {
                    list.add(a);
                }
             Collections.sort(list);
                long sum = 0;
                for (int j = list.size() - 1, k = 26; j >= 0; j--) {
                    sum += (list.get(j) * k--);
                }
                System.out.println(sum);
            }

        }
    }

    public static HashMap<Character, Integer> getChTimes(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i= 0; i< str.length(); i++) {
            char c=str.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }

        }
        return map;
    }
}
