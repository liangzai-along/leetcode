package question.双指针;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/17 20:24
 * 地址：https://leetcode-cn.com/problems/3sum/
 */
public class _15_三数之和 {


    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 3) return res;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) return res;
            // 排除相同元素
            if (i > 0 && nums[i] == nums[i+1]) continue;
            int left = i;
            int right = nums.length-1;
            while (left < right) {
                int tempSum = nums[i] + nums[left] + nums[right];
                if (tempSum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    // 排除相同元素
                    while (left < right && nums[left] == nums[left+1]) left++;
                    while (left < right && nums[right] == nums[right-1]) right--;
                    left++;
                    right--;
                } else if (tempSum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return res;
    }
}
