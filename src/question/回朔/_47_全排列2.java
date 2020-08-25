package question.回朔;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/25 10:32
 * 地址：https://leetcode-cn.com/problems/permutations-ii/
 */
public class _47_全排列2 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {

        LinkedList<Integer> track = new LinkedList<>();
        boolean[] isUsed = new boolean[nums.length];
        Arrays.sort(nums);
        backtrack(nums, track, isUsed);
        return res;
    }

    public void backtrack(int[] nums, LinkedList<Integer> track, boolean[] isUsed) {
        // 结束条件
        if (track.size() == nums.length) {
            res.add(new LinkedList<>(track));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // 判断无效
            if (isUsed[i]) continue;
            // 剪枝
            if (i > 0 && nums[i] == nums[i-1] && !isUsed[i-1]) continue;
            track.add(nums[i]);
            isUsed[i] = true;

            backtrack(nums, track, isUsed);

            isUsed[i] = false;
            track.removeLast();

        }
    }
}
