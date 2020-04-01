package huawei;

import java.util.*;

/**
 * Created by zhengjie on 2020/3/23.
 * 排序数组
 */
public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            if (a > 0) {
                for (int i = 0; i < a; i++) {
                    list.add(scanner.nextInt());
                }
            }
            Collections.sort(list);
            System.out.println(list.get(0));
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) != list.get(i - 1)) {
                    System.out.println(list.get(i));
                }
            }
            list.clear();
        }

    }
}
