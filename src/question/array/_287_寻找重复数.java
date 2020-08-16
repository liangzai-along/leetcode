package question.array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/16 9:36
 * 地址：https://leetcode-cn.com/problems/find-the-duplicate-number/
 */
public class _287_寻找重复数 {

    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if (length == 0 || numbers == null){
            return false;
        }else{
            for (int i = 0; i < length; i++){
                //归位
                while (numbers[i] != i){
                    //如果要交换的数相等，则重复
                    if (numbers[i] == numbers[numbers[i]]){
                        duplication[0] = numbers[i];
                        return true;
                    }
                    //交换，交换规则是把这个数赋值给另外一个数，让另外一个数归位
                    int temp = numbers[i];
                    numbers[i] = numbers[temp];
                    numbers[temp] = temp;
                }
            }
            return false;
        }
    }
}
