package question.递归;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/18 10:04
 * 地址：https://leetcode-cn.com/problems/recursive-mulitply-lcci/
 */
public class _0805_递归乘法 {


    public int multiply(int A, int B) {
        // 减少加号
        if (A <= B) {
             return multiplyHelper(A, B);
        }else {
            return multiplyHelper(B, A);
        }

    }
    // 递归函数
    public int multiplyHelper(int A, int B) {
        if (A == 0) {
            return 0;
        }
        return  multiplyHelper(A-1, B) + B;
    }
}
