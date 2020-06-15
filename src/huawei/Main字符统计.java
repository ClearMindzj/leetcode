package huawei;

import java.util.*;

/**
 * Created by zhengjie on 2020/4/10.
 */
public class Main字符统计 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String s=scanner.nextLine();
            Map<Character,Integer> map=new TreeMap<>(new Comparator<Character>() {
                @Override
                public int compare(Character o1, Character o2) {
                    return o1-o2;
                }
            });
            for (int i = 0; i <s.length() ; i++) {
                char c=s.charAt(i);
                if(map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                }else {
                    map.put(c,1);
                }
            }
            List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
                @Override
                public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                    return o2.getValue()-o1.getValue();
                }
            });
            for(Map.Entry<Character,Integer> l:list){
                System.out.print(l.getKey());
            }
            System.out.println();
        }
    }
}
