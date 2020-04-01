package Demo;

/**
 * Created by zhengjie on 2020/3/14.
 */
public class demo02 {
    public static void main(String[] args) {
     String a="abc";
     String b=new String("abc");
        System.out.println(a.hashCode()+" "+b.hashCode());
        System.out.println(a==b);

    }
}
