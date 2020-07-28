package question.string;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/28 19:36
 * 地址：https://www.nowcoder.com/practice/45327ae22b7b413ea21df13ee7d6429c?tpId=13&&tqId=11205&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class _52_正则表达式 {
    public boolean match(char[] str, char[] pattern){
        if (str == null || pattern == null){
            return false;
        }
        return match(str, pattern, 0, 0);
    }

    public boolean match(char[] str, char[] pattern, int i, int j){
        // 终止条件
        if (i == str.length && j == pattern.length){
            return true;
        }
        // 模式不足以匹配
        if (i < str.length && j == pattern.length){
            return false;
        }
        // 模式的第二个是*
        if (j+1 < pattern.length && pattern[j+1] == '*'){
            // 如果字符串第一个字符跟模式第一个字符匹配，可以有3种匹配方式
            if (i != str.length && pattern[j] == str[i] || (pattern[j] == '.' && i != str.length)) {
                return
                        // 字符串后移1字符，模式后移2字符
                        match(str, pattern, i + 1, j + 2)
                                // 字符串后移1字符，模式不变，即继续匹配字符下一位，因为*可以匹配多位
                                || match(str, pattern, i + 1, j)
                                // 模式后移2字符，相当于x*被忽略
                                || match(str, pattern, i, j + 2);
            } else {
                return match(str, pattern, i, j + 2);
            }

        }
        // 如果字符串第一个字符和模式中的第一个字符相匹配，那么字符串和模式都后移一个字符，然后匹配剩余的
        if ((i != str.length && str[i] == pattern[j]) || (pattern[j] == '.' && i != str.length)) {
            return match(str, pattern, i + 1, j + 1);
        }
        // 如果字符串第一个字符和模式中的第一个字符相不匹配，直接返回false
        return false;
    }
}
