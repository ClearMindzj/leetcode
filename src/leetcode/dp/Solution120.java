package leetcode.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengjie on 2020/3/6.
 * 三角形最小路径和
 */
public class Solution120 {
    public static void main(String[] args) {
        List<List<Integer>> lists=new ArrayList<List<Integer>>();
        List<Integer> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        list.add(2);
        lists.add(list);
        list1.add(3);
        list1.add(4);
        lists.add(list1);
        Solution120 solution120=new Solution120();
        System.out.println(solution120.minimumTotal(lists));
    }
   public int minimumTotal(List<List<Integer>> triangle) {
        int m=triangle.size();
        int[][] dp=new int[m+1][m+1];
        dp[1][1]=triangle.get(0).get(0);
        for (int i = 2; i <=m ; i++) {
            for (int j = 1; j <=triangle.get(i-1).size(); j++) {
                //三角形左边界
              if(j==1){
                  dp[i][j]=triangle.get(i-1).get(j-1)+dp[i-1][j];
              }
               //三角形右边界
              else if(j==triangle.get(i-1).size()){
                  dp[i][j]=triangle.get(i-1).get(j-1)+dp[i-1][j-1];
              }else {
                  dp[i][j]=Math.min(dp[i-1][j-1],dp[i-1][j])+triangle.get(i-1).get(j-1);
              }
            }
        }
        int j=Integer.MAX_VALUE;
        for(int i=1;i<=m;i++){
             j=Math.min(dp[m][i],j);
        }
        return j;
    }

}
