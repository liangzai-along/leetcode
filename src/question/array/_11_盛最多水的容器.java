package question.array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/21 16:47
 * 地址：https://leetcode-cn.com/problems/container-with-most-water/
 */
public class _11_盛最多水的容器 {
    // 暴力遍历法
    public int maxArea(int[] height) {
        int areaMax = 0;
        for (int i =0; i < height.length; i++){
            for (int j = i+1; j < height.length; j++) {
                int y = height[j] < height[i] ? height[j] : height[i];
                int x = j - i;
                int temp = x * y;
                if(temp > areaMax) {
                    areaMax = temp;
                }
            }
        }
        return areaMax;
    }
}
