package datastructure.leetcode.math;

import java.util.ArrayList;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/6/18 10:39
 */
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayLists = FindContinuousSequence(1);
        for (int i = 0; i < arrayLists.size(); i++) {
            System.out.println(arrayLists.get(i));
        }
    }
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer> > alist = new ArrayList<ArrayList<Integer> >();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < sum; i++){
            int res = 0;
            int j = i;
            while (res < sum){
                res += j;
                j++;
            }
            if (res == sum){
                list = new ArrayList<>();
                for (int k = i; k < j; k++){
                    list.add(k);
                }
                alist.add(list);
            }
        }
        return alist;
    }
}
