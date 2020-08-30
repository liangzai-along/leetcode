package question.array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/30 17:00
 * 地址：https://leetcode-cn.com/problems/is-unique-lcci/
 */
public class _0101_判定字符是否唯一 {
    // 思路：hash算法，只要出现次数大于1的就返回false
    public boolean isUnique(String astr) {
        int[] hash = new int[256];
        for (int i = 0; i < astr.length(); i++) {
            hash[astr.charAt(i)]++;
            if (hash[astr.charAt(i)] > 1) return false;
        }
        return true;
    }
}
