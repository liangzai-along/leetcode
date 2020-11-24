package question.基础排序;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/11/24 14:35
 */
public class _05_快速排序 {

    public static void quickSort(int[] nums, int left, int right) {
        if (left < right) {
            // 加上下面这句话就是随机快排，不加就是经典快排
            //swap(nums,left+(int)Math.random()*(right-left+1), right);
            // 荷兰国旗划分好之后，继续递归划分剩下两个区域
            int[] p = partition(nums, left, right);
            quickSort(nums, left, p[0]-1);
            quickSort(nums, p[1]+1, right);
        }
    }
    // 默认以最后一个数做划分
    public static int[] partition(int[] nums, int left, int right) {
        int less = left - 1;
        int more = right;
        while (left < more) {
            if (nums[left] < nums[right]) {
                // 交换过来的数已经比较过了，直接可以++
                swap(nums, ++less, left++);
            } else if (nums[left] > nums[right]) {
                // 这里cur不加，是因为交换过来这个数，还没有比较多，需要再比较一次
                swap(nums, --more,left);
            } else {
                left++;
            }
        }
        swap(nums, more, right);
        // 返回等于区域的范围
        return new int[] {less+1, more};
    }
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
