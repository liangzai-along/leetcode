package question.排序;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/5 16:03
 * 地址：https://leetcode-cn.com/problems/minimum-subsequence-in-non-increasing-order/
 */
public class _1403_非递增顺序的最小子序列 {
    // 思路：排序，因为要最少，所以从最大的那边开始取数就行了
    List<Integer> res = new ArrayList<>();
    public List<Integer> minSubsequence(int[] nums) {
        // 求总的和
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        // 排序
        Arrays.sort(nums);
        int temp = 0;
        int p = 0;
        for (int i = nums.length-1; i >= 0; i--) {
            temp += nums[i];
            int temp2 = sum - temp;
            if (temp <= temp2) {
                res.add(nums[i]);
            } else {
                // 最后一个添加不到，等到最后进行添加
                p = i;
                break;
            }
        }
        // 最后一个
        res.add(nums[p]);
        return res;
    }
}
