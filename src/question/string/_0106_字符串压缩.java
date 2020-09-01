package question.string;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/1 11:08
 * 地址：https://leetcode-cn.com/problems/compress-string-lcci/
 */
public class _0106_字符串压缩 {
    public String compressString(String s) {
        if (s == null || s.length() == 0) return "";
        StringBuilder res = new StringBuilder();
        int length = s.length();
        int start = 0;
        for (int i = 0; i < length+1; i++) {

            if (i == length) {
                res.append(s.charAt(start)).append(i-start);
            } else if (s.charAt(i) != s.charAt(start)) {
                res.append(s.charAt(start)).append(i-start);
                start = i;
            }
        }
        int length2 =  res.toString().length();
        return length <= length2 ? s : res.toString();
    }
}
