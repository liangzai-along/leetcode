package question.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/10/3 15:37
 * 地址：https://leetcode-cn.com/problems/pascals-triangle/
 */
public class _118_杨辉三角 {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        if (numRows == 0) return res;
        if (numRows == 1) {
            temp.add(1);
            res.add(temp);
            return res;
        }
        res.add(Arrays.asList(1));
        for (int i = 1; i < numRows; i++) {
            List<Integer> path = new ArrayList<>();
            path.add(1);
            // 获取上一行的数组
            for (int j = 1; j < res.get(res.size()-1).size(); j++) {
                path.add(res.get(res.size()-1).get(j)+res.get(res.size()-1).get(j-1));
            }
            path.add(1);
            res.add(path);
        }
        return res;
    }
}
