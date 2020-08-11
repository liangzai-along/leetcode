package question.递归;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/11 19:33
 * 地址：https://www.nowcoder.com/practice/72a5a919508a4251859fb2cfb987a0e6?tpId=13&&tqId=11163&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */


public class _10_矩形覆盖 {

    /**
     * 主要是分析过程：是一个斐波那契数列
     * 所以，递归最难的就是找规律
     */
    public class Solution {
        public int RectCover(int target) {
            if (target <= 2) {
                return target;
            }else {
                return RectCover(target -1) + RectCover(target -2);
            }
        }
    }
}
