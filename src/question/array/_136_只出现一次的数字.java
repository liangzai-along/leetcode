package question.array;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/16 15:27
 * 地址：https://leetcode-cn.com/problems/single-number/
 */
public class _136_只出现一次的数字 {
    // 负数不能用数组代替hash
    //public int singleNumber(int[] nums) {
    //    int[] hash = new int[100000];
    //    for (int i = 0; i < nums.length; i++) {
    //        hash[nums[i]]++;
    //    }
    //    int res = 0;
    //    for (int i = 0; i < hash.length; i++) {
    //        if (hash[i] == 1){
    //            res = i;
    //            return res;
    //        }
    //    }
    //    return res;
    //}
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])){
                set.remove(nums[i]);
            }else {
                set.add(nums[i]);
            }
        }
        int res = 0;
        for (Integer re: set){
            res = re;
        }
        return res;
    }



}
