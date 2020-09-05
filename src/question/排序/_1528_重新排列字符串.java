package question.排序;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/5 9:34
 * 地址：
 */
public class _1528_重新排列字符串 {

    // 使用额外空间,喝了点酒，脑子差点没绕过来
    public String restoreString(String s, int[] indices) {
        char[] res = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int temp = indices[i];
            res[temp] = s.charAt(i);
        }
        return new String(res);
    }
}
