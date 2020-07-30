package question.string;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/30 16:33
 * 地址：https://www.nowcoder.com/practice/4060ac7e3e404ad1a894ef3e17650423?tpId=13&&tqId=11155&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class _2_替换空格 {
    public String replaceSpace(StringBuffer str) {

        // 使用库函数
        //return str.toString().replaceAll("\\s", "%20");
        // 边界
        if (str == null) return null;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (c==' '){
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
