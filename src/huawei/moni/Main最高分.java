package huawei.moni;

import java.util.*;

/**
 * Created by zhengjie on 2020/4/14.
 */
public class Main最高分 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i <a ; i++) {
                list.add(scanner.nextInt());
            }
            for (int i = 0; i <b ; i++) {
                String s=scanner.next();
                if(s.equals("Q")){
                    int start=scanner.nextInt();
                    int end=scanner.nextInt();
                    if(start>end){
                        int temp=start;
                        start=end;
                        end=temp;
                    }
                    List<Integer> list1=new ArrayList<>();
                    for (int j = start-1; j <end ; j++) {
                        list1.add(list.get(j));
                    }
                    Collections.sort(list1);
                    System.out.println(list1.get(list1.size()-1));
                }else {

                    int A=scanner.nextInt();
                    int B=scanner.nextInt();
                    list.remove(A-1);
                    list.add(A-1,B);
                }
            }
        }
    }
}
