package question.string;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/31 15:32
 * 地址：https://leetcode-cn.com/problems/add-binary/
 */
public class _67_二进制求和 {
    // 和415一模一样
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int add = 0;
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? a.charAt(i) - '0' : 0;
            int y = j >= 0 ? b.charAt(j) - '0' : 0;
            int result = x + y + add;
            // 取余
            ans.append(result % 2);
            // 整除
            add = result / 2;
            i--;
            j--;
        }
        ans.reverse();
        return ans.toString();
    }
}
