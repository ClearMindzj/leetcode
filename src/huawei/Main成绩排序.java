package huawei;

import java.util.*;

/**
 * Created by zhengjie on 2020/4/2.
 */
public class Main成绩排序 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()) {


            int a = scanner.nextInt();
            int b = scanner.nextInt();
            Map<String, Integer> map = new LinkedHashMap<>();
            for (int i = 0; i < a; i++) {
                String s1 = scanner.next();
                int a1 = scanner.nextInt();
                map.put(s1+" "+a1, a1);
            }
            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
            Collections.sort(list, (o1, o2) -> {
                if (b == 0) {
                    return o2.getValue() - o1.getValue();
                } else {
                    return o1.getValue() - o2.getValue();
                }

            });
            for (Map.Entry<String, Integer> t : list) {
                System.out.println(t.getKey());
            }
        }
    }
}
