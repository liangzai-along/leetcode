package question.string;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/30 17:06
 * 地址：https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof/
 */
public class _58_翻转字符串 {

    // 利用Stringbuilder, 要注意连续多个空格和首尾空格的情况
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String[] split = s.trim().split(" ");
        for (int i = split.length-1; i >= 0; i--) {
            // 注意这里要用equals，不要用==
            if (split[i].equals("")) continue;
            res.append(split[i]+" ");
        }
        return res.toString().trim();
    }
}
