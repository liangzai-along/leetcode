package question.位运算;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/11/29 18:57
 */
public class _56_数组中数字出现的次数2 {

    public int singleNumber(int[] nums) {
        int[] counts = new int[32];
        for (int num : nums) {
            for (int j = 0; j < 32; j++) {
                // 获得二进制最右一位
                counts[j] += num & 1;
                num >>>= 1; // 无符号右移操作
            }
        }
        int res = 0, m = 3;
        for (int i = 0; i < 32; i++) {
            res <<= 1; // 左移一位
            res |= counts[31-i] % m;
        }
        return res;
    }
}
