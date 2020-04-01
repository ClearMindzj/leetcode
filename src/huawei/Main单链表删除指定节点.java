package huawei;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by zhengjie on 2020/3/29.
 */
public class Main单链表删除指定节点 {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            int firstNode = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            list.add(firstNode);
            for(int i=0;i<num-1;i++){
                int Node1 = sc.nextInt();           //要插入的节点
                int Node2 = sc.nextInt();           //插入在哪个节点之后
                int index = list.indexOf(Node2);
                list.add(index+1,Node1);

            }
            Object deleteNode = sc.nextInt();
            list.remove(deleteNode);
            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i)+" ");
            }
           // System.out.println();
        }
        sc.close();
    }
}
