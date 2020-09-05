package question.排序;

import java.util.Arrays;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/5 10:32
 * 地址：https://leetcode-cn.com/problems/ba-shu-zu-pai-cheng-zui-xiao-de-shu-lcof/
 */
public class _45_把数组排成最小的数 {
    // 思路：排序，排序规则
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, (x, y) -> (x+y).compareTo(y+x));
        StringBuilder res= new StringBuilder();
        for (String s : strs) {
            res.append(s);
        }
        return res.toString();
    }
}
