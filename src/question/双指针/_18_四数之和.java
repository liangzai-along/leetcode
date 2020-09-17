package question.双指针;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/17 20:36
 * 地址：https://leetcode-cn.com/problems/4sum/
 */
public class _18_四数之和 {
    // 比三数之和多了一个循环
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if (nums == null || len < 4) return res;
        for (int i = 0; i < len - 3; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            for (int j = i+1; j < len -2; j++) {
                if (j > i+1 && nums[j] == nums[j-1]) continue;
                int L = j + 1;
                int R = len - 1;
                while (L < R) {
                    int temp = nums[i] + nums[j] + nums[L] + nums[R];
                    if (temp == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[L]);
                        list.add(nums[R]);
                        res.add(list);
                        while (L < R && nums[L+1] == nums[L]) L++;
                        while (L < R && nums[R-1] == nums[R]) R--;
                        L++;
                        R--;
                    } else if (temp < target) {
                        L++;
                    } else {
                        R--;
                    }
                }
            }
        }
        return res;
    }
}
