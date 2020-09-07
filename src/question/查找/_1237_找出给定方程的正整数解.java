package question.查找;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/7 21:31
 * 地址：https://leetcode-cn.com/problems/find-positive-integer-solution-for-a-given-equation/
 */
public class _1237_找出给定方程的正整数解 {
/*    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> res = new ArrayList<>();
        int start = 1;
        int end = 1000;
        while (start <= 1000 && end >=1) {
            int r = customfunction.f(start, end);
            // 因为是单调的
            if (r == z) {
                List<Integer> temp = new ArrayList<>();
                temp.add(start);
                temp.add(end);
                res.add(temp);
                start++;
                end--;
            } else if (r < z) {
                start++;
            } else {
                end--;
            }
        }
        return res;
    }*/
}
