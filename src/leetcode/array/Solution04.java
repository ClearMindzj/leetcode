package leetcode.array;

/**
 * Created by zhengjie on 2020/3/5.
 */
public class Solution04 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
           int m=nums1.length;
           int n=nums2.length;
           int len=m+n;
           int left=-1,right=-1;
           int aStart=0,bStart=0;
        for (int i = 0; i < len/2+1; i++) {
            left=right;
            if((aStart<m)&&(bStart>=n||nums1[aStart]<nums2[bStart])){
                right=nums1[aStart++];
            }else {
                left=nums2[bStart++];
            }
            //如果是偶数记录中间偏左那个数据
            left=right;

        }
        if(len%2==0){
            return left+right/2;
        }else {
            return right;
        }
    }
}
