package datastructure.leetcode.String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/6/12 20:55
 */
public class Main {

    //Insert one char from stringstream
    LinkedHashMap<Character, Integer> mp = new LinkedHashMap<>();

    public void Insert(char ch) {
        if (mp.containsKey(ch)) {
            mp.put(ch, mp.get(ch) + 1);
        } else {
            mp.put(ch, 1);
        }
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce () {
        for (Map.Entry entry:mp.entrySet()){
            Integer a = 1;
            if (entry.getValue() == a){
                return (char) entry.getKey();
            }
        }
        return '#';
    }
}
