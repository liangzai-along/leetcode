package question.排序;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/12 19:06
 * 地址：https://leetcode-cn.com/problems/median-of-two-sorted-arrays/
 */
public class _4_寻找两个正序数组的中位数 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] list = merge(nums1, nums2);
        double res = 0.0;
        int p = list.length;
        if (p % 2 == 0) {
            res = ((double)list[p/2]+list[p/2 - 1])/2;
        } else {
            res = list[p/2];
        }
        return res;
    }

    // 合并两个有序数组
    public int[] merge(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length + nums2.length];
        int i = 0; int j = 0;
        int k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                res[k++] = nums1[i++];
            } else {
                res[k++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            res[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            res[k++] = nums2[j++];
        }
        return res;
    }
}
