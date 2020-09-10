package question.位运算;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/10 21:01
 * 地址：https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/
 */
public class _39_数组中出现次数超过一半的数字 {
    public int majorityElement(int[] nums) {
        int[] bit = new int[32];
        int n = nums.length;
        for(int a : nums){
            for(int i=0; i<32; i++){
                //无符号右移; 负数的无符号右移移动的是补码还是原码?
                if(((a>>>i) & 1) == 1)
                    bit[i]++;
            }
        }

        int res=0;
        for(int i=0; i<32; i++){
            if(bit[i]>n/2)
                // 将二进制转换为十进制
                res = res | (1<<i);
        }
        return res;
    }

}
