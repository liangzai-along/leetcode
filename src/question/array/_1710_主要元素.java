package question.array;

import java.util.HashMap;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/29 10:14
 * 地址：https://leetcode-cn.com/problems/find-majority-element-lcci/
 */
public class _1710_主要元素 {
    public int majorityElement(int[] nums) {
        // 思路：利用hash,存储元素以及次数，这种复杂度要高一点
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                hash.put(nums[i], hash.get(nums[i]) + 1);
            } else {
                hash.put(nums[i], 1);
            }
            if (hash.get(nums[i]) > nums.length/2) return nums[i];
        }
        return -1;
    }
}
