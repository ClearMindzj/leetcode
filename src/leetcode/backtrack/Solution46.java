package leetcode.backtrack;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengjie on 2020/3/14.
 * 全排列
 */
public class Solution46 {
    public List<List<Integer>> permute(int[] nums) {
      List<List<Integer>> lists=new ArrayList<>();
      List<Integer> list=new ArrayList<>();
      backtrack(lists,list,nums);
      return lists;
    }

    public  void backtrack(List<List<Integer>> lists,List<Integer> list,int[] nums){
        if(list.size()==nums.length){
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i <nums.length ; i++) {
            //排除不符合情况的
            if(list.contains(nums[i]))
                continue;
             list.add(nums[i]);
             backtrack(lists,list,nums);
             list.remove(list.size()-1);
        }
    }
}
