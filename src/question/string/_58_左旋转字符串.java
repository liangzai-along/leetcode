package question.string;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/1 10:28
 * 地址：https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 */
public class _58_左旋转字符串 {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n, s.length())+s.substring(0,n);
    }
}
