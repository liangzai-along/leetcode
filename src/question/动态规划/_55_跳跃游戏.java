package question.动态规划;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/10/2 16:25
 * 地址：https://leetcode-cn.com/problems/jump-game/solution/
 */
public class _55_跳跃游戏 {

    public boolean canJump(int[] nums) {
        // dp[i]表示从第i个位置出发，能否到达终点
        // 递推公式：dp[i]=dp[i+1] || dp[i+2] || ... || dp[i+nums[i]]
        boolean[] dp=new boolean[nums.length];
        dp[dp.length-1]=true;
        for(int i=dp.length-2;i>=0;i--){
            // 从当前点，判断所有他能到达的点，看能否到达
            for(int j=1;j<=nums[i];j++){
                if(dp[i+j]){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[0];
    }
}
