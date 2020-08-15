package question.array;

import java.util.HashSet;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/15 19:51
 * 地址：https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/
 */

// 变形： 三个数，四个数相加， 多个树相加
//  多个数加减乘除
public class _57_和为s的两个数字 {
    public int[] twoSum(int[] nums, int target) {
        //=============
        // 双指针
        //int low = 0;
        //int high = nums.length-1;
        //while (low < high) {
        //    int s = nums[low] + nums[high];
        //    if (s == target) {
        //        return new int[] {nums[low], nums[high]};
        //    }else if (s > target) {
        //        high--;
        //    }else {
        //        low++;
        //    }
        //}
        //return new int[0];
        //================

        // hash法
        HashSet<Integer> set = new HashSet<>();
        for (int num:nums){
            set.add(num);
        }
        for (int num:nums) {
            int e = target - num;
            if (set.contains((e))){
                return new int[] {num, e};
            }
        }
        return new int[0];

    }



}
