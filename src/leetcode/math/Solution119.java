package leetcode.math;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengjie on 2020/3/6.
 */
public class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans=new ArrayList<>();
        for (int i = 0; i < rowIndex+1; i++) {
            List<Integer> sub = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    sub.add(1);
                } else {
                    List<Integer> last = ans.get(i - 1);
                    sub.add(last.get(j - 1) + last.get(j));
                }
            }
            ans.add(sub);
        }
        return ans.get(ans.size()-1);
    }
}
