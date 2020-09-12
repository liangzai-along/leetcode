package question.string;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/12 19:13
 * 地址：https://leetcode-cn.com/problems/zigzag-conversion/
 */
public class _6_Z字形变换 {
    // 思路：找规律
    public String convert(String s, int numRows) {
        int len = s.length();
        if (len == 1) return s;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            // 主要
            for (int j = i; j < len; j += (numRows-1)*2) {
                sb.append(s.charAt(j));
                // 中间斜的处理
                if (i > 0 && i < numRows-1) {
                    // 比上面多了一个i,表示行
                    int sec = j + 2 * (numRows-i-1);
                    if (sec < len) {
                        sb.append(s.charAt(sec));
                    }
                }
            }
        }
        return sb.toString();
    }
}
