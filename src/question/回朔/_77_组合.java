package question.回朔;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/20 10:16
 * 地址：https://leetcode-cn.com/problems/combinations/
 * 参考：https://leetcode-cn.com/problems/subsets/solution/hui-su-si-xiang-tuan-mie-pai-lie-zu-he-zi-ji-wen-t/
 */
public class _77_组合 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        if (k <= 0 || n <= 0) return res;
        backtrack(n, k, 1, new ArrayList<>());
        return res;
    }

    public void backtrack(int n, int k, int start, ArrayList<Integer> track) {
        if (k == track.size()) {
            res.add(new ArrayList<>(track));
            return;
        }

        for (int i = start; i <= n; i++) {
            // 做选择
            track.add(i);
            // 回溯
            backtrack(n,k,i+1,track);
            // 撤销选择
            track.remove(track.size() -1);
        }
    }
}
