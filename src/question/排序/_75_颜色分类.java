package question.排序;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/11/24 21:55
 */
public class _75_颜色分类 {

    //  快排中的一部分，荷兰国旗问题
    public void sortColors(int[] nums) {
        if (nums == null || nums.length < 0) return;
        partition(nums, 0, nums.length-1,1);
    }


    public void partition(int[] nums, int left, int right,int target) {
        int less = left - 1;
        int more = right + 1;
        int cur = left;
        while (cur < more) {
            if (nums[cur] < target) {
                swap(nums, ++less, cur++);
            } else if (nums[cur] > target) {
                swap(nums, --more, cur);
            } else {
                cur++;
            }
        }
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
