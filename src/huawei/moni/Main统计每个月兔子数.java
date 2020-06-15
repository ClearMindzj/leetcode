package huawei.moni;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/4/15.
 */
public class Main统计每个月兔子数 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int a=scanner.nextInt();
            System.out.println(get(a));
        }
    }
    public static int get(int a){
        if(a==1||a==2){
            return 1;
        }
        return get(a-1)+get(a-2);
    }
}
