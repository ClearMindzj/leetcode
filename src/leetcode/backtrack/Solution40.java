package leetcode.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhengjie on 2020/3/20.
 * 组合总和II
 */
public class Solution40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> lists=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        List<Integer> old=new ArrayList<>();
        backtrack(lists,list,old,candidates,0,target);
        return lists;
    }
    public void backtrack(List<List<Integer>>lists,List<Integer> list,List<Integer>old,int[] nums,int start,int target){
          if(target<0){
              return;
          }else
              //满足条件
              if(target==0){
              lists.add(new ArrayList<>(list));
          }else {
                  for (int i = start; i <nums.length ; i++) {
                      //存放list存在的数
                      if (old.contains(i)){
                          continue;
                      }
                      //第二轮开始如果出现重复的，直接跳过
                      if(i>0&&!old.contains(i-1)&&nums[i]==nums[i-1]){
                          continue;
                      }
                      old.add(i);
                      list.add(nums[i]);
                      backtrack(lists,list,old,nums,i,target-nums[i]);
                      old.remove(old.size()-1);
                      list.remove(list.size()-1);
                  }
              }
    }
}
