package question.回朔;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/20 9:11
 * 地址：https://leetcode-cn.com/problems/subsets/
 * 参考：https://leetcode-cn.com/problems/subsets/solution/hui-su-suan-fa-by-powcai-5/
 */
public class _78_子集 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(0, nums, new ArrayList<>());
        return res;
    }

    private void backtrack(int start, int[] nums, ArrayList<Integer> track) {
        res.add(new ArrayList<>(track));
        for (int i = start; i < nums.length; i++) {
            // 选择
            track.add(nums[i]);
            // 回溯
            backtrack(i+1, nums, track);
            // 撤销选择
            track.remove(track.size() - 1);
        }
    }

    /*public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, res, new ArrayList<Integer>());
        return res;

    }

    private void backtrack(int i, int[] nums, List<List<Integer>> res, ArrayList<Integer> tmp) {
        res.add(new ArrayList<>(tmp));
        for (int j = i; j < nums.length; j++) {
            tmp.add(nums[j]);
            backtrack(j + 1, nums, res, tmp);
            tmp.remove(tmp.size() - 1);
        }
    }*/
}
