package leetcode.math;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengjie on 2020/3/6.
 *杨辉三角形
 */
public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> ans=new ArrayList<>();
        for (int i = 0; i <numRows ; i++) {
            List<Integer> sub=new ArrayList<>();
            for (int j = 0; j <=i ; j++) {
                 if(j==0||j==i){
                     sub.add(1);
                 }else {
                     List<Integer> last=ans.get(i-1);
                     sub.add(last.get(j-1)+last.get(j));
                 }
            }
            ans.add(sub);
        }
        return ans;
    }
}
