package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by zhengjie on 2020/3/24.
 */
public class Solution56 {
    public int[][] merge(int[][] intervals) {
        Comparator<int[]> comparator =new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        };
        //按照左边从小到大排序
        Arrays.sort(intervals,comparator);
        List<int[]> list=new ArrayList<>();
        int i=0;
        int n=intervals.length;
        //左右指针来维护
        while (i<n){
            int left=intervals[i][0];
            int right=intervals[i][1];
            while (i<n-1&&right>=intervals[i+1][0]){
                //为什么要用max，因为可能出现以下情况[1,4],[2,3]第一个把第二个包住了。
                right=Math.max(intervals[i+1][1],right);
                i++;
            }
            list.add(new int[]{left,right});
            i++;
        }
        return  list.toArray(new int[list.size()][2]);
    }
}
