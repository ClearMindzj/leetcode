package graph.huawei;

/**
 * Created by zhengjie on 2020/4/26.
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(getResult(101));
    }
    public static char getResult(int n){
        StringBuilder sb=new StringBuilder();
        for (int i = 1; i <n ; i++) {
            sb.append(i);
        }
        String s=sb.toString();
        return  s.charAt(n-1);
    }
}
