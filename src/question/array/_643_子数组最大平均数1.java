package question.array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/25 22:41
 * 地址：https://leetcode-cn.com/problems/maximum-average-subarray-i/submissions/
 */
public class _643_子数组最大平均数1 {
    // 思路1：暴力遍历
    public double findMaxAverage(int[] nums, int k) {
        double ans=-99999; double res;
        // int[] sum = new int[nums.length];
        for(int i=0; i<nums.length-k+1; i++){
            int sum = 0;
            for(int j=i; j<i+k; j++){
                // sum[i] += nums[j];
                sum += nums[j];
            }
            res=((double)sum/k);
            ans=Math.max(ans, res);
        }
        return ans;
    }
}
