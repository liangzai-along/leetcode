package question.string;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/21 14:53、
 * 地址：https://leetcode-cn.com/problems/string-to-integer-atoi/
 */
public class _8_字符串转换整数 {
    public static void main(String[] args) {

        myAtoi("00000000123456");

    }

    public static int myAtoi(String str) {

        // 消除最后的空格
        str = str.trim();
        char[] chars = str.toCharArray();
        if (chars.length == 0) return 0;
        boolean negative = false;
        int ans = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i == 0){
                if (chars[0] == '-'){
                    negative = true;
                    continue;
                }else if (chars[0] == '+') {
                    continue;
                }else if (!Character.isDigit(chars[i])){
                    return 0;
                }
            }

            if (!Character.isDigit(chars[i])) {
                if (chars[i] == '.'){
                    return negative ? -ans : ans;
                }else{
                    break;
                }
            }
            int digit = chars[i] - '0';
            // 数字都需要考虑溢出
            if (ans > (Integer.MAX_VALUE - digit) /10) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            ans = ans * 10 + digit;
        }
        return negative ? -ans : ans;
    }
}
