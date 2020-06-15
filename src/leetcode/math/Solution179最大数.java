package leetcode.math;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by zhengjie on 2020/4/17.
 */
public class Solution179最大数 {
    public static void main(String[] args) {
        Solution179最大数 solution179=new Solution179最大数();
        int[] nums={3,30,34,5,9};
        System.out.println(solution179.largestNumber(nums));
    }
    public String largestNumber(int[] nums) {
        if(nums.length==0){
            return "";
        }
        String[] s1=new String[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            s1[i]= String.valueOf(nums[i]);
        }
        //自定义比较器
        Arrays.sort(s1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <s1.length ; i++) {
            sb.append(s1[i]);
        }
        String result=sb.toString();
        //特殊情况 若干个零
        if (result.charAt(0) == '0') {
            result = "0";
        }
        return  result;
    }
}
