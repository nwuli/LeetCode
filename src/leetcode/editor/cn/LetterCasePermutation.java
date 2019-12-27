//给定一个字符串S，通过将字符串S中的每个字母转变大小写，我们可以获得一个新的字符串。返回所有可能得到的字符串集合。
//
// 
//示例:
//输入: S = "a1b2"
//输出: ["a1b2", "a1B2", "A1b2", "A1B2"]
//
//输入: S = "3z4"
//输出: ["3z4", "3Z4"]
//
//输入: S = "12345"
//输出: ["12345"]
// 
//
// 注意： 
//
// 
// S 的长度不超过12。 
// S 仅由数字和字母组成。 
// 
// Related Topics 位运算 回溯算法

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    public static void main(String[] args) {
        Solution solution = new LetterCasePermutation().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> letterCasePermutation(String S) {
            List<String> res = new ArrayList<>();
            StringBuffer stringBuffer = new StringBuffer().append(S);
            if (S.length() == 0 || S == null) return res;
            backtrack(res, stringBuffer, S, 0);
            res.add(S);
            return res;
        }

        public void backtrack(List<String> res, StringBuffer stringBuffer, String S, int j) {
            for (int i = j; i < S.length(); i++) {
                if (0 <= S.charAt(i) - '0' && S.charAt(i) - '0' <= 9) {
                    continue;
                }
                if ('a' - '0' <= S.charAt(i) - '0' && S.charAt(i) - '0' <= 'z' - '0') {
                    stringBuffer.setCharAt(i, String.valueOf(S.charAt(i)).toUpperCase().charAt(0));

                } else {
                    stringBuffer.setCharAt(i, String.valueOf(S.charAt(i)).toLowerCase().charAt(0));

                }

                String s = stringBuffer.toString();
                res.add(s);
                backtrack(res, stringBuffer, S, i + 1);
                stringBuffer.setCharAt(i, S.charAt(i));


            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}