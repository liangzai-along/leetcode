package question.查找;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/7 21:56
 * 地址：https://leetcode-cn.com/problems/peak-index-in-a-mountain-array/
 */
public class _852_山脉数组的峰顶索引 {
    // 思路：找到不再下降的地方
    public int peakIndexInMountainArray(int[] arr) {
        // int res = 0;
        // for (int i = 1; i < arr.length; i++) {
        //     if (arr[i] < arr[i-1]) {
        //         res = i-1;
        //         break;
        //     }
        // }
        // return res;

        // 二分法，优化时间复杂度
        int left = 0;
        int right = arr.length-1;
        while (left < right) {
            int mid = left + (right-left)/2;
            if (arr[mid] < arr[mid+1]) {
                left = mid+1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
