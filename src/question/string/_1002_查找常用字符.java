package question.string;
import java.util.*;
/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/15 15:19
 * 地址：https://leetcode-cn.com/problems/find-common-characters/
 */
public class _1002_查找常用字符 {

    public List<String> commonChars(String[] A) {
        // 边界
        List<String> list = new ArrayList<>();
        if (A == null || A.length == 0) return list;
        HashMap<Character,Integer> res = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            char[] cs = A[i].toCharArray();
            for (char c : cs) {
                if (map.containsKey(c)) {
                    map.put(c,map.get(c)+1);
                }else {
                    map.put(c, 1);
                }
            }
            // 判断是否是第一个map
            if (i ==0){
                res.putAll(map);
            } else {
                // 不是第一个map,则将目前这个map和res进行匹配key,如果有相同的key,则更新newMap
                HashMap<Character,Integer> newMap = new HashMap<>();
                for(Map.Entry<Character,Integer> entry: res.entrySet()) {
                    Character key = entry.getKey();
                    Integer value = entry.getValue();
                    if (map.containsKey(key)) {
                        Integer temp = map.get(key);
                        newMap.put(key, Math.min(temp, value));
                    }

                }
                res = newMap;
            }
        }
        for (Map.Entry<Character,Integer> entry: res.entrySet()) {
            Integer value = entry.getValue();
            while (value > 0) {
                list.add(String.valueOf(entry.getKey()));
                value--;
            }
        }
        return list;
    }

}
