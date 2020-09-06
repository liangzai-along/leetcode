package question.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/6 10:44
 * 地址：https://leetcode-cn.com/problems/next-greater-element-i/
 */
public class _496_下一个更大元素1 {

    // 思路：暴力解法
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            int temp = nums1[i];
            boolean flag = false;
            for (int j = 0; j < nums2.length; j++) {
                if (temp == nums2[j]) {
                    flag = true;
                }
                if (flag) {
                    if (nums2[j] > temp) {
                        flag = false;
                        array.add(nums2[j]);
                        break;
                    }
                }
            }
            if (flag) {
                array.add(-1);
            }
        }
        for (int i = 0; i < array.size(); i++) {
            res[i] = array.get(i);
        }
        return res;
    }
}
