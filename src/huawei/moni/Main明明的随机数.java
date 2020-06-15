package huawei.moni;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by zhengjie on 2020/4/14.
 */
public class Main明明的随机数 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int a=scanner.nextInt();
            Set<Integer> set=new TreeSet<>();
            for (int i = 0; i <a ; i++) {
                set.add(scanner.nextInt());
            }
            for (int i:set){
                System.out.println(i);
            }

        }

    }


}
