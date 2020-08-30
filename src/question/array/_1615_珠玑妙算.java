package question.array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/30 15:20
 * 地址：https://leetcode-cn.com/problems/master-mind-lcci/
 */
public class _1615_珠玑妙算 {
    // 核心思想：伪的等于总的减去真的
    public int[] masterMind(String solution, String guess) {
        int correct = 0;
        int total = 0;
        //猜中的个数，就是索引和数字都对上了
        for (int i = 0; i < solution.length(); i++) {
            if (solution.charAt(i) == guess.charAt(i)) {{
                correct++;
            }}
        }
        char[] c = guess.toCharArray();
        char[] s = solution.toCharArray();
        for (int i = 0; i < s.length; i++) {
            char temp = s[i];
            for (int j = 0; j < c.length; j++) {
                if (temp == c[j]) {
                    total++;
                    s[i] = '#';
                    c[j] = '#';
                    break;
                }
            }
        }
        return new int[]{correct, total-correct};

    }

}
