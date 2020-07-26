package question.string;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/26 15:01
 * 地址：https://www.nowcoder.com/practice/1277c681251b4372bdef344468e4f26e?tpId=13&&tqId=11202&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */

/**
 * 主要是特殊情况的分析判断
 */
public class _49_把字符串转换成整数 {
    public int StrToInt(String str) {
        if (str == null || str.length()==0){
            return 0;
        }
        long number = 0;
        boolean isNegative = false;
        for (int i =0; i < str.length();i++){
            // 判断第一个符号 是否表示 正负+ -
            if (i == 0 && str.charAt(i) == '+' || str.charAt(i) == '-'){
                if (str.charAt(i) == '-'){
                    isNegative = true;
                }
                // 只有一个符号的情况
                if (str.length() == 1){
                    return 0;
                }
                continue;
            }
            // 中间有非数字的情况直接返回
            if (str.charAt(i) < '0' || str.charAt(i) > '9'){
                return 0;
            }

            int flag = isNegative ? -1:1;
            // 核心代码；前面的都是处理其他情况
            // str.charAt(i) - '0'得到的是对应的数字
            number = number * 10 + flag * (str.charAt(i) - '0');
            if (!isNegative && number > Integer.MAX_VALUE || isNegative && number < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int)number;

    }
}
