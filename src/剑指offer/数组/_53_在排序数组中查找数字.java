package 剑指offer.数组;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/12/20 11:14
 */
public class _53_在排序数组中查找数字 {
    public int search(int[] nums, int target) {
        // 边界判断
        if (nums == null || nums.length == 0) return 0;
        // 用什么数据结构
        // 统计次数，用hash类
        // 统计一个，则用一个变量即可
        // int[] hashTable = new int[nums.length + 1];
        int count = 0;
        //======================= 普通实现
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == target) {
        //     count++;
        // }
        //========================普通实现


        // 根据规律，设计算法
        // 规律是排序数组-二分法
        // 二分法的顺序问题，经常在选择题中出现
        int position = searchHelper(nums, target);
        if (position == -1) {
            return 0;
        }else {
            for (int i = position; i < nums.length; i++) {
                if (nums[i] != target) {
                    break;
                }else{
                    count++;
                }
            }
            for (int i = position-1; i >=0; i--) {
                if (nums[i] != target) {
                    break;
                }else{
                    count++;
                }
            }
        }
        return count;
    }
    public int searchHelper (int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int p = 0;
        while (low <= high) {
            int mid = low + high >> 1;
            if (nums[mid] == target) {
                return mid;
            }else if (nums[mid] > target) {
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
