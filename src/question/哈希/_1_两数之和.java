package question.哈希;

import java.util.HashMap;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/12 9:48
 * 地址：https://leetcode-cn.com/problems/two-sum/
 */
public class _1_两数之和 {
    // 思路1：暴力遍历
    // 思路2：排序后二分查找
    // 思路3：因为存在映射关系，科研利用hash
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if (nums == null || nums.length < 2) {
            return res;
        }
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                res[0] = i;
                res[1] = hash.get(nums[i]);
                return res;
            }

            hash.put(target-nums[i], i);
        }
        return res;
    }
}
