package question.回朔;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/23 13:34
 * 地址：https://leetcode-cn.com/problems/24-game/
 */
public class _679_24点游戏 {

    // 目标
    static final int TARGET = 24;
    static final int ADD = 0, MULTIPLY = 1, SUBTRACT = 2, DIVIDE = 3;
    // 误差
    static final double EPSILON = 1e-6;

    public boolean judgePoint24(int[] nums) {
        List<Double> list = new ArrayList<>();
        for (int num : nums) {
            list.add((double)num);
        }
        return backtract(list);
    }
    public boolean backtract(List<Double> list) {
        int size = list.size();
        if (size == 0) return false;
        if (size == 1) {
            return Math.abs(list.get(0) - TARGET) < EPSILON;
        }
        // 计算两个数,数字有前后顺序，所以需要这样遍历
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i != j) {

                    List<Double> list2 = new ArrayList<>();
                    // 添加除掉上面的两位数i和j的其他数
                    for (int k = 0; k < size; k++) {
                        if (k != i && k != j) {
                            list2.add(list.get(k));
                        }
                    }
                    // 计算，添加另外一位数，回朔的添加
                    for (int k = 0; k < 4; k++) {
                        if (k==ADD) {
                            list2.add(list.get(i) + list.get(j));
                        } else if (k == MULTIPLY) {
                            list2.add(list.get(i) * list.get(j));
                        } else if (k == SUBTRACT) {
                            list2.add(list.get(i) - list.get(j));
                        } else if (k == DIVIDE){
                            // 判断分母不能为0,因为是浮点数,绝对值小于1e-6,认为为0
                            if (Math.abs(list.get(j)) < EPSILON) {
                                continue;
                            } else {
                                list2.add(list.get(i) / list.get(j));
                            }
                        }
                        // 回朔
                        if (backtract(list2)) return true;
                        // 撤销上一部操作
                        list2.remove(list2.size() - 1);
                    }
                }
            }
        }
        return false;
    }

}
