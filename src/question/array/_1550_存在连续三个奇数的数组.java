package question.array;

import java.util.LinkedList;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/29 10:33
 * 地址：https://leetcode-cn.com/problems/three-consecutive-odds/
 */
public class _1550_存在连续三个奇数的数组 {
    // 滑动窗口思路，连续这种是滑动窗口的思想，然后就是窗口处理细节不同而已
    public boolean threeConsecutiveOdds(int[] arr) {
        LinkedList<Integer> res = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            if (temp % 2 == 1) {
                res.add(temp);
            } else {
                res = new LinkedList<>();
            }
            if (res.size() == 3){
                return true;
            }
        }
        return false;
    }
}
