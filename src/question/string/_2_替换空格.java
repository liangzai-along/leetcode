package question.string;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/30 16:33
 * 地址：https://www.nowcoder.com/practice/4060ac7e3e404ad1a894ef3e17650423?tpId=13&&tqId=11155&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class _2_替换空格 {
    public String replaceSpace(StringBuffer str) {

        // 边界
        if (str == null) return null;
        // 解法1：使用库函数
        //return str.toString().replaceAll("\\s", "%20");
        // 解法2：使用stringBuilder
        /*StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (c==' '){
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();*/

        // 更底层的实现方法
        int oldLength = str.length();
        // 扩展str:
        for (int i = 0; i < oldLength; i++){
            if (str.charAt(i) == ' ') {
                // 填充两个空格，20%是三个字符，之前有一个加上填充2个为三个
                str.append("  ");
            }
        }
        int newLength = str.length();
        // 两个尾指针，从尾开始扫描，不需要移动太多次
        int p1 = oldLength - 1;
        int p2 = newLength - 1;
        // 解决连续空格替换成一个%20
        boolean isFirst = true;
        while (p1 != p2) {
            if (str.charAt(p1) == ' ') {
                if (isFirst) {
                    str.setCharAt(p2--, '0');
                    str.setCharAt(p2--, '2');
                    str.setCharAt(p2--, '%');
                    p1--;
                    isFirst = false;
                }
            } else {
                str.setCharAt(p2--, str.charAt(p1--));
                isFirst = true;
            }
        }
        return str.toString();
    }
}
