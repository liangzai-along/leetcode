package question.回朔;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/25 11:06
 * 地址：https://leetcode-cn.com/problems/combination-sum/
 */
public class _39_组合总和 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(candidates,0, target, track);
        return res;
    }

    public void backtrack(int[] candidates, int begin, int target, LinkedList<Integer> track) {

        // 终止条件
        if (target < 0) return;
        if (target == 0) {
            res.add(new ArrayList<>(track));
            return;
        }

        for (int i = begin; i < candidates.length; i++) {
            track.add(candidates[i]);
            backtrack(candidates, i, target-candidates[i], track);
            track.removeLast();
        }

    }
}
