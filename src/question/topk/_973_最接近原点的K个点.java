package question.topk;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/16 16:18
 * 地址：https://leetcode-cn.com/problems/k-closest-points-to-origin/
 */
public class _973_最接近原点的K个点 {

    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> (cal(b) - cal(a)));
        int[][] result = new int[K][2];
        for(int i = 0; i < K; i++){
            maxHeap.offer(points[i]);
        }
        for(int i = K; i < points.length; i++){
            if(cal(maxHeap.peek()) > cal(points[i])){
                maxHeap.poll();
                maxHeap.offer(points[i]);
            }
        }
        for(int i = 0; i < K; i++){
            result[i] = maxHeap.poll();
        }
        return result;
    }

    public int cal(int a[]){
        return (a[0] * a[0]) + (a[1] * a[1]);
    }

}
