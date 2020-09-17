package question.双指针;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/17 21:56
 * 地址：https://leetcode-cn.com/problems/merge-sorted-array/
 */
public class _88_合并两个有序数组 {
    // 双指针
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[nums1.length];
        int p1 = 0, p2 = 0, k = 0;
        while (p1 < m && p2 < n) {
            if (nums1[p1] < nums2[p2]) {
                temp[k++] = nums1[p1++];
            } else {
                temp[k++] = nums2[p2++];
            }
        }
        while (p1 < m) temp[k++] = nums1[p1++];
        while (p2 < n) temp[k++] = nums2[p2++];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] =temp[i];
        }
    }
}
