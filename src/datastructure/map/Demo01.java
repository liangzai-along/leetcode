package datastructure.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/6/6 20:04
 */
public class Demo01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");
        for (Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println("====");
            System.out.println(entry.getValue());
        }
    }
}
