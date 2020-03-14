package leetcode.search;

/**
 * Created by zhengjie on 2020/3/2.
 * 二分查找求最长递增子序列
 */
public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {6, 3, 5, 10, 11, 2, 9, 14, 13, 7, 4, 8, 12};
        System.out.println(binarySearch.lengthOfLIS(nums));
    }

    public int lengthOfLIS(int[] nums) {
        int[] top = new int[nums.length]; // 牌堆数初始化为 0
        int piles = 0;
        for (int i = 0; i < nums.length; i++) { // 要处理的扑克牌
            int poker = nums[i];
            /***** 搜索左侧边界的二分查找 *****/
            int left = 0, right = piles;
            while (left < right) {
                int mid = (left + right) / 2;
                if (top[mid] > poker) {
                    right = mid;
                } else if (top[mid] < poker) {
                    left = mid + 1;
                } else {
                    right = mid;


                }
            }
            /*********************************/
// 没找到合适的牌堆，新建一堆
            if (left == piles) piles++;
            // 把这张牌放到牌堆顶
            top[left] = poker;
        }
// 牌堆数就是 LIS ⻓度
        return piles;
    }
}
