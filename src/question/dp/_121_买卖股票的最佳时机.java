package question.dp;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/17 9:50
 * 地址：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 */
public class _121_买卖股票的最佳时机 {

    // 原始暴力解法
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int[] list = new int[prices.length];
        for (int begin = 0; begin < prices.length; begin++) {
            int max = 0;
            for (int end = begin + 1; end < prices.length; end ++){
                int dis = prices[end] - prices[begin];
                if (dis > 0) {
                    if (dis > max) {
                        max = dis;
                    }
                }
            }
            list[begin] = max;
        }
        int res = 0;
        for (int i : list) {
            if (i > res) {
                res = i;
            }
        }
        return res;
    }
}
