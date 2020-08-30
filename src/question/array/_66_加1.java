package question.array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/30 9:55
 * 地址：https://leetcode-cn.com/problems/plus-one/
 */
public class _66_加1 {
    public int[] plusOne(int[] digits) {
        int len = digits.length -1;
        int[] res = plus(digits, len);
        if (res[0] == 0) {
            res = new int[len+2];
            res[0] = 1;
        }
        return res;
    }

    // 递归
    public int[] plus(int[] digits, int k) {
        // 终止条件
        if (k < 0) {
            return digits;
        }
        // 子问题
        if (digits[k] != 9) {
            digits[k] += 1;
        } else {
            digits[k] = 0;
            plus(digits, k-1);

        }
        return digits;
    }

    // 也可以使用循环来进行，每个都加1.然后取余,空间复杂度要比递归的低
    public int[] plusOne2(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
