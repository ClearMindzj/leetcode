package leetcode.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhengjie on 2020/3/14.
 * 全排列II
 */
public class Solution47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
         Arrays.sort(nums);
         List<List<Integer>> lists=new ArrayList<>();
         List<Integer> old=new ArrayList<>();
         List<Integer> temp=new ArrayList<>();
         backtrack(lists,old,temp,nums);
         return  lists;
    }
    public void backtrack(List<List<Integer>> lists,List<Integer> old,List<Integer> temp,int[] nums){
        if(temp.size()==nums.length){
            lists.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i <nums.length ; i++) {
            //去重
            if(old.contains(i)){
                continue;
            }
            //第二轮如果第二位和第一位相同就直接跳过
            if(i>0&&!old.contains(i-1)&&nums[i-1]==nums[i]){
                continue;
            }
            old.add(i);
            temp.add(nums[i]);
            backtrack(lists,old,temp,nums);
            temp.remove(temp.size()-1);
            old.remove(old.size()-1);
        }
    }
}
