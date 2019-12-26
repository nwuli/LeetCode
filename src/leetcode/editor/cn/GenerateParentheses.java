//给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
//
// 例如，给出 n = 3，生成结果为： 
//
// [
//  "((()))",
//  "(()())",
//  "(())()",
//  "()(())",
//  "()()()"
//]
// 
// Related Topics 字符串 回溯算法

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        Solution solution = new GenerateParentheses().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> generateParenthesis(int n) {
            //回溯法。回溯的过程保证左括号的个数大于右括号
            List<String> result = new ArrayList<>();
            backtrack(result, "", 0, 0, n);
            return result;
        }

        public void backtrack(List<String> result, String tmp, int left, int right, int max) {
            if (left == max && right == max) {
                result.add(tmp);
                return;
            }
            if (left < right) return;
            if (left < max) {
                backtrack(result, tmp + '(', left + 1, right, max);
            }
            if (left > right && right < max) {
                backtrack(result, tmp + ')', left, right + 1, max);
            }

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}