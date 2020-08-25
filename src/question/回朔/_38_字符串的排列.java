package question.回朔;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/25 8:42
 * 地址：https://leetcode-cn.com/problems/zi-fu-chuan-de-pai-lie-lcof/
 */

// 注意这题是有重复字符串的情况的
public class _38_字符串的排列 {

    public static void main(String[] args) {
        String s = "aab";
        permutation(s);
    }
    static List<String> list = new ArrayList<>();
    public static String[] permutation(String s) {
        char[] nums = s.toCharArray();
        // 排序是剪枝的前提
        Arrays.sort(nums);
        LinkedList<Character> track = new LinkedList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, track, used);
        String[] res = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
    public static void backtrack(char[] nums, LinkedList<Character> track, boolean[] used) {
        if (track.size() == nums.length) {
            String temp = "";
            for (int i = 0; i < track.size(); i++) {
                temp += track.get(i);
            }
            list.add(temp);
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }

            // 剪枝， used[i-1] 被撤销
            if (i > 0 && nums[i] == nums[i-1] && !used[i-1]) {
                continue;
            }

            track.add(nums[i]);
            used[i] = true;

            backtrack(nums, track, used);

            used[i] = false;
            track.removeLast();
        }
    }

}
