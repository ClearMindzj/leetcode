package leetcode.dp;

/**
 * Created by zhengjie on 2020/3/3.
 * 买股票最佳时机
 * 双指针
 */
public class Solution121 {

        public int maxProfit(int[] prices) {
            int m=prices.length;
            int left=0;
            int right=0;
            int max=0;
            for(;right<m;right++){
                if(prices[right]>prices[left])
                    max=Math.max(max,prices[right]-prices[left]);
                else {
                    left=right;
                }
            }
            return max;
        }
}
