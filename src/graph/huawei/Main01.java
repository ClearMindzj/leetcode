package graph.huawei;

import java.util.*;

/**
 * Created by zhengjie on 2020/4/15.
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s1 = scanner.nextLine();
            String[] s = s1.split(",");
            boolean flag=false;
            for (int i = 0; i < s.length; i++) {
                String ss2=s[i];
                if(!Character.isUpperCase(ss2.charAt(0))){
                    System.out.println("error.0001");
                    flag=true;
                    break;
                }
                for (int j = 1; j <ss2.length() ; j++) {
                    if(!Character.isLowerCase(ss2.charAt(j))){
                        System.out.println("error.0001");
                        flag=true;
                        break;
                    }
                }
                if(flag==true){
                    break;
                }

            }
            if(flag==true){
                break;
            }
            Map<String, Integer> map = new TreeMap<>();
            for (int i = 0; i < s.length; i++) {
                if (map.containsKey(s[i])) {
                    map.put(s[i], map.get(s[i]) + 1);
                } else {
                    map.put(s[i], 1);
                }
            }

            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    if (o1.getValue() == o2.getValue()) {
                        if (o1.getKey().charAt(0) == o2.getKey().charAt(0)) {
                            return o1.getKey().length() - o2.getKey().length();
                        } else {
                            return o1.getKey().charAt(0) - o2.getKey().charAt(0);
                        }

                    } else {
                        return o2.getValue() - o1.getValue();
                    }
                }
            });
            System.out.println(list.get(0).getKey());
        }


    }

}
