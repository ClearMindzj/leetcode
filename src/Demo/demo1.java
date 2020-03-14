package Demo;

import java.util.HashMap;

/**
 * Created by zhengjie on 2020/3/13.
 */
public class demo1 {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"aa");
        map.put(2,"bb");
        System.out.println(map.values());
    }
}
