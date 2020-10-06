package question.回文;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/10/6 9:59
 * 地址：https://leetcode-cn.com/problems/palindromic-substrings/
 */
public class _647_回文子串 {

    // 思路：判断有多少个回文子串
    public int countSubstrings(String s) {
        // 边界判断
        if (s == null || s.length() == 0) return 0;
        char[] array = s.toCharArray();
        int count = array.length; // 最小为数组的长度
        // 暴力遍历法
        for (int start = 0; start < array.length-1; start++) {
            for (int end = start+1; end < array.length; end++) {
                if (isValid(array, start, end)) {
                    count++;
                }
            }
        }
        return count;
    }


    // 判断回文
    public boolean isValid(char[] array, int left, int right) {
        while (left < right) {
            if (array[left] != array[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
