package question.string;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/31 10:41
 * 地址：https://leetcode-cn.com/problems/implement-strstr/
 */
public class _28_实现strStr {
    public static void main(String[] args) {
        int i = strStr("mississippi", "issip");
        System.out.println(i);
    }

    // 思路：子串判断，并且返回第一个位置，滑动窗口思想
    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;
        if (needle.length() == 0) return 0;
        // 这里注意指针
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            // 双指针
            int start = 0;
            int j = i;
            while (start < needle.length()) {
                if (haystack.charAt(j) != needle.charAt(start)) {
                    break;
                } else {
                    start++;
                    j++;
                    if (start == needle.length()) return i;
                }
            }

        }
        return -1;
    }
}

