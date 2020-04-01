package leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengjie on 2020/3/19.
 * 组合总和
 */
public class Solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> lists=new ArrayList<>();
         List<Integer> list=new ArrayList<>();
         backtrack(lists,list,candidates,target,0);
         return lists;
    }

    public void backtrack(List<List<Integer>> lists,List<Integer> list,int[] nums,int target,int start) {
        if (target<0){
            return;
        }else if(target==0){
            lists.add(new ArrayList<>(list));
        }else {
            for (int i = start; i <nums.length; i++) {
                list.add(nums[i]);
                backtrack(lists,list,nums,target-nums[i],i);
                list.remove(list.size()-1);
            }
        }


    }

}
