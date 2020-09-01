package question.string;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/1 20:00
 * 地址：https://leetcode-cn.com/problems/add-strings/
 */
public class _415_字符串相加 {
    public String addStrings(String num1, String num2) {
        StringBuilder ans = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;
        int add = 0; // 进位之后的数
        // add 用于最后的位，
        while (i >=0 || j >= 0 || add != 0) {
            // 得到数字
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + add;
            ans.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }
        ans.reverse();
        return ans.toString();
    }
}
