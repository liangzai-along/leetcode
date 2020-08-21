package question.math;

import java.util.HashMap;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/21 20:10
 * 地址：https://leetcode-cn.com/problems/roman-to-integer/
 */
public class _13_罗马数字转整数 {
    public int romanToInt(String s) {
        // 建立映射
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int res = 0;
        char[] chars = s.toCharArray();
        int len = chars.length;
        if (len == 1) {
            char temp = chars[0];
            return map.get(temp);
        }
        char temp = chars[0];
        int preNum = map.get(temp);
        for (int i = 1; i < len; i++) {
            temp = chars[i];
            // 当前值
            int num = map.get(temp);
            if (preNum < num) {
                res -= preNum;
            } else {
                res += preNum;
            }
            preNum = num;
        }
        res += preNum;
        return res;
    }
}
