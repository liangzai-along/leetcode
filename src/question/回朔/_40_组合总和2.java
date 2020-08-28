package question.回朔;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/28 10:46
 * 地址：https://leetcode-cn.com/problems/combination-sum-ii/
 */
public class _40_组合总和2 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        LinkedList<Integer> track = new LinkedList<>();
        Arrays.sort(candidates);
        backtrack(candidates, 0, target, track);
        return res;

    }

    // 回溯
    public void backtrack(int[] candidates, int begin, int target, LinkedList<Integer> track) {

        if (target < 0) return;
        if (target == 0) {
            res.add(new ArrayList<>(track));
            return;
        }

        for (int i = begin; i < candidates.length; i++) {
            // 大剪枝
            if (target - candidates[i] < 0) {
                break;
            }

            // 小剪枝
            if (i > begin && candidates[i] == candidates[i - 1]) {
                continue;
            }

            track.add(candidates[i]);
            backtrack(candidates, i+1, target-candidates[i], track);
            track.removeLast();
        }
    }
}
