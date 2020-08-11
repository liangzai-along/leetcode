package question.递归;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/11 19:03
 * 地址：https://www.nowcoder.com/practice/8c82a5b80378478f9484d87d1c5f12a4?tpId=13&&tqId=11161&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class _8_跳台阶 {

    /**
     * 实质是一个斐波那契数列：利用递归
     * @param target
     * @return
     */
    public int jumpFloor(int target) {
        if (target <= 0) return 0;
        if (target == 1 || target == 2) {
            return target;
        }else {
            return jumpFloor(target -1) + jumpFloor(target -2);
        }
    }

    /**
     * 动态规划实现
     * @param target
     * @return
     */
    public int jump(int target) {
        if (target <= 0) return 0;
        if (target == 1 || target ==2) {
            return target;
        }
        int first = 1;
        int second = 2;
        for (int n = 3; n <= target; n++) {
            second = first + second;
            first = second - first;
        }
        return second;
    }
}
