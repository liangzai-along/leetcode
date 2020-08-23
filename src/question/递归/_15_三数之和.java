package question.递归;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/18 9:45
 * 地址：https://leetcode-cn.com/problems/3sum/
 */
public class _15_三数之和 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if (nums == null || len < 3) return res;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            // 已经排好序，如果第一位元素大于0，则后面两个数也大于0，则不存在
            if (nums[i] > 0) break;
            // 这是第一个数字，需要和上次的第一个数字不相同
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int temp = nums[i];
            // 左指针,第二个数
            int L = i + 1;
            // 右指针，第三个数
            int R = len - 1;
            // 第三个数从最右侧开始，因为是排好序的，L增加的话，R减小才能到0
            while (L < R) {
                if (nums[i] + nums[L] + nums[R] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[L]);
                    list.add(nums[R]);
                    res.add(list);
                    // 排除相同元素
                    while (L < R && nums[L+1] == nums[L]) L++;
                    while (L < R && nums[R-1] == nums[R]) R--;
                    L++;
                    R--;
                } else if (nums[i] + nums[L] + nums[R] > 0) {
                    R--;
                } else {
                    L++;
                }
            }
        }
        return res;
    }
}
