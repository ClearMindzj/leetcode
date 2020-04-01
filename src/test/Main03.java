package test;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by zhengjie on 2020/4/1.
 */

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int a=scanner.nextInt();
            while (a-->0){
                int n=scanner.nextInt();
                int m=scanner.nextInt();
                int[] blood=new int[n];
                int[] hury=new int[m];
                int[] cost=new int[m];
                for (int i = 0; i <n ; i++) {
                    blood[i]=scanner.nextInt();
                }
                for (int i = 0; i <m ; i++) {
                    hury[i]=scanner.nextInt();
                }
                for (int i = 0; i <m ; i++) {
                    cost[i]=scanner.nextInt();
                }
              List<List<Integer>> lists=new ArrayList<>();
                List<Integer> list1=new ArrayList<>();
                List<Integer> list2=new ArrayList<>();
                List<Integer> result=new ArrayList<>();
                lists=backtrack(blood,hury,cost,lists,list1,list2,result);
                int sum=0;
                int temp=0;
                for (int i = 0; i <lists.size() ; i++) {
                    List<Integer> list=lists.get(i);
                    for(int j:list){
                        temp+=j;
                    }
                    sum=Math.max(sum,temp);
                }
                System.out.println(sum);
            }
        }
    }
    public static List<List<Integer>> backtrack(int[] blood, int[] hury, int[] cost, List<List<Integer>>lists, List<Integer> list1, List<Integer> list2, List<Integer> result){
       if(result.size()==blood.length){
           lists.add(result);
       }
        for (int i = 0; i <hury.length ; i++) {
               if(list1.contains(i)) continue;
                list1.add(i);
            for (int j = 0; j <blood.length ; j++) {
                if(list2.contains(j)) continue;
                list2.add(j);
                if(hury[i]>blood[j]){
                    result.add(cost[i]);
                    backtrack(blood,hury,cost,lists,list1,list2,result);
                    result.remove(result.size()-1);
                }
                list2.remove(list2.size()-1);
            }
            list1.remove(list1.size()-1);
        }
        return lists;
    }
}
