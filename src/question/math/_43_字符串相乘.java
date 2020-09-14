package question.math;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/14 11:12
 * 地址：https://leetcode-cn.com/problems/multiply-strings/
 */
public class _43_字符串相乘 {
    // 思路：每个符号转换为数来相乘，然后考虑进位问题，最后转换为字符
    public String multiply(String num1, String num2) {
        char[] value = new char[num1.length() + num2.length()];
        for (int i = num1.length()-1; i >= 0; i--) {
            for (int j = num2.length()-1; j >= 0; j--) {
                value[i+j+1] += (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
            }
        }
        int carry = 0;
        for (int i = value.length-1; i >= 0; i--) {
            value[i] += carry;
            carry = value[i]/10;
            value[i] %= 10;
        }
        int index = 0;
        while (index < value.length-1 && value[index] == 0) {
            index++;
        }
        for (int i =  index; i < value.length; i++) {
            value[i] += '0';
        }
        return new String(value, index, value.length-index);
    }
}
