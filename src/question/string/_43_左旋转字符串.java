package question.string;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/30 20:57
 * 地址：https://www.nowcoder.com/practice/12d959b108cb42b1ab72cef4d36af5ec?tpId=13&&tqId=11196&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 *
 */
public class _43_左旋转字符串 {
    // 使用标准库
    public String LeftRotateString(String str,int n) {
        if (str == null || n > str.length()) return str;
        return str.substring(n) + str.substring(0,n);
    }
}
