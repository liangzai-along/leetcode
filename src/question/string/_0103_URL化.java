package question.string;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/1 12:31
 * 地址：https://leetcode-cn.com/problems/string-to-url-lcci/
 */
public class _0103_URL化 {
    public String replaceSpaces(String S, int length) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < length; i++){
            if(S.charAt(i) == ' '){
                sb.append("%20");
            }else{
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }
}
