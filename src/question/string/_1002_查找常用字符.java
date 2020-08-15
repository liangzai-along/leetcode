package question.string;
import java.util.*;
/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/15 15:19
 * 地址：https://leetcode-cn.com/problems/find-common-characters/
 */
public class _1002_查找常用字符 {

    // 复杂度有点高====哈哈哈
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


         public List<String> commonChars2(String[] A) {

            // 入参检查
            if(A == null || A.length == 0 || A.length == 1) {
                return null;
            }
            // 记录每个字符出现的次数（字符的ASCII码-97的值做数组下标）
            int[] hash = new int[26];
            // 是否第一次维护hash数组
            boolean firstFlag = true;
            // 遍历字符串
            for (String word : A) {
                // 拆分成字符数组
                char[] wordChars = word.toCharArray();
                // 如果是第一次维护hash数组
                if (firstFlag) {
                    // 直接记录每个字符出现的个数
                    for (char wordChar : wordChars) {
                        hash[wordChar - 97]++;
                    }
                    // 标志置为否
                    firstFlag = false;
                // 如果不是第一次维护，即hash数组中有值时
                }else {
                    // 新建临时数组tmpHash来记录当前字符数组每个字符出现的次数
                    int[] tmpHash = new int[26];
                    for (char wordChar : wordChars) {
                        tmpHash[wordChar - 97]++;
                    }

                    // 维护hash数组
                    for(int i = 0; i < hash.length; ++i) {
                        // 比较hash数组和tmpHash数组
                        // hash记录每次每个字符出现的最小次数
                        if(hash[i] > tmpHash[i]) {
                            hash[i] = tmpHash[i];
                        }
                    }
                }
            }
            // 组装返回结果
            List<String> res = new ArrayList<>();
            for(int i = 0; i < hash.length; ++i) {
                if(hash[i] != 0) {
                    String tmp = String.valueOf((char)(i + 97));
                    for(int j = 0; j < hash[i]; ++j) {
                        res.add(tmp);
                    }
                }
            }

            return res;
         }

}
