package question.回朔;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/19 19:26
 * 地址：https://leetcode-cn.com/problems/permutations/
 * 答案参考：https://labuladong.gitbook.io/algo/suan-fa-si-wei-xi-lie/hui-su-suan-fa-xiang-jie-xiu-ding-ban
 */
public class _46_全排列 {

    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
        // 记录路径
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(nums, track);
        return res;
    }
    /**
     *
     * @param nums: 选择列表
     * @param track：路径列表
     */
    public void backtrack(int[] nums, LinkedList<Integer> track) {

        if (track.size() == nums.length) {
            res.add(new LinkedList<>(track));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (track.contains(nums[i])) {
                continue;
            }
            // 做选择
            track.add(nums[i]);
            // 做下一层决策树
            backtrack(nums, track);
            // 取消选择
            track.removeLast();
        }
    }
}
