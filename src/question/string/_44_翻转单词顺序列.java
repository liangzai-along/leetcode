package question.string;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/26 8:51
 * 地址：https://www.nowcoder.com/practice/3194a4f4cf814f63919d0790578d51f3?tpId=13&&tqId=11197&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class _44_翻转单词顺序列 {

    public String ReverseSentence(String str) {
        if (str == null || str.trim().equals("")) return str;
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--){
            sb.append(words[i]);
            if (i > 0) sb.append(" ");

        }
        return sb.toString();
    }
}
