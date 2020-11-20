package question.递归;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/11/20 17:00
 */
public class _剑指51_困难_数组中的逆序对 {
    // 归并排序的应用-分治思想
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length <2) return 0;
        return mergeSort(nums, 0, nums.length-1);
    }

    public int mergeSort(int[] nums, int left, int right) {
        if (left == right) return 0;
        int mid = left + ((right-left)>>1);
        return mergeSort(nums, left, mid)
                + mergeSort(nums, mid+1, right)
                + merge(nums, left, mid, right);
    }
    public int merge(int[] nums, int left, int mid, int right) {
        int[] help = new int[right-left+1];
        int i = 0;
        int p1 = left;
        int p2 = mid+1;
        int res = 0;
        while (p1 <= mid && p2 <= right) {
            // 主要是这里的区别：如果是求所有的和则要写出（right-p2+1）*nums[p1]
            res += nums[p1] > nums[p2] ? (right - p2 + 1) * 1 : 0;
            help[i++] = nums[p1] > nums[p2] ? nums[p1++] : nums[p2++];
        }
        while (p1 <= mid) {
            help[i++] = nums[p1++];
        }
        while (p2 <= right) {
            help[i++] = nums[p2++];
        }
        for (int k = 0; k < help.length; k++) {
            nums[left+k] = help[k];
        }
        return res;
    }
}
