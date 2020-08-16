package question.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/16 10:38
 * 地址：https://leetcode-cn.com/problems/contains-duplicate/
 */
public class _217_存在重复元素 {
    // 涉及次数==就是数据和次数的映射，利用hash===有映射关系就可以用hash
    // 但是时间复杂度较高，后面再改进
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                hash.put(nums[i],hash.get(nums[i])+1);
            }else {
                hash.put(nums[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : hash.entrySet()) {
            if (entry.getValue() >= 2) {
                return true;
            }
        }
        return false;
    }
}
