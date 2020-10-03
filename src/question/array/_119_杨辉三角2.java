package question.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/10/3 15:54
 * 地址：https://leetcode-cn.com/problems/pascals-triangle-ii/
 */
public class _119_杨辉三角2 {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> res = new ArrayList<>();
        if (rowIndex == 0) {
            res.add(1);
            return res;
        }
        // 保存前一个
        List<Integer> first = new ArrayList<>();
        first.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            res = new ArrayList<>();
            res.add(1);
            for (int j = 1; j < first.size(); j++) {
                res.add(first.get(j)+first.get(j-1));
            }
            res.add(1);
            first = res;
        }
        return res;
    }
}
