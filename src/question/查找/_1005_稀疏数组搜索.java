package question.查找;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/7 21:49
 * 地址：https://leetcode-cn.com/problems/sparse-array-search-lcci/
 */
public class _1005_稀疏数组搜索 {
    // 思路：主要是空字符串的处理，先转换为稀疏数组
    public int findString(String[] words, String s) {
        String[][] arrays = new String[words.length][2];
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals("")){
                arrays[count][0]=words[i];
                arrays[count][1]=String.valueOf(i);
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            if (arrays[i][0].equals(s)) return Integer.parseInt(arrays[i][1]);
        }
        return -1;
    }
}
