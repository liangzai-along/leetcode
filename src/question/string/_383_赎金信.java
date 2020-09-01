package question.string;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/1 19:26
 * 地址：https://leetcode-cn.com/problems/ransom-note/
 */
public class _383_赎金信 {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] r = ransomNote.toCharArray();
        char[] m = magazine.toCharArray();
        if (r.length > m.length) return false;
        for (int i = 0; i < r.length; i++) {
            // 标记比较一轮是否存在没有找到的情况，提前结束
            boolean falg = true;
            for (int j = 0; j < m.length; j++) {
                if (r[i] == m[j]) {
                    falg = true;
                    //防止重复使用
                    m[j] = '#';
                    break;
                } else {
                    falg = false;
                }
            }
            if (falg == false) return false;
        }
        return true;
    }
}
