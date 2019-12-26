//给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
//
// 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。 
//
// 
//
// 示例: 
//
// 输入："23"
//输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
// 
//
// 说明: 
//尽管上面的答案是按字典序排列的，但是你可以任意选择答案输出的顺序。 
// Related Topics 字符串 回溯算法

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        Solution solution = new LetterCombinationsOfAPhoneNumber().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //类似排列组合
//        public List<String> letterCombinations(String digits) {
//            //排列组合、队列实现，真滴强
//            LinkedList<String> queue = new LinkedList<>();
//            if (digits.length() == 0) return queue;
//            queue.add("");
//            String[] map = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//            for (int i = 0; i < digits.length(); i++) {
//                int index = digits.charAt(i) - '0';
//                while (queue.peek().length() == i) {
//                    String base = queue.remove();
//                    for (char c : map[index].toCharArray()) {
//                        queue.add(base + c);
//                    }
//
//                }
//            }
//            return queue;
//
//        }
        List<String> result = new ArrayList<>();
        String[] map = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};


        public List<String> letterCombinations(String digits) {

            if (digits.length() == 0 || digits == "") return result;
            combation(digits, "", 0);
            return result;
        }

        public void combation(String digits, String letter, int index) {
            if (index == digits.length()) {
                result.add(letter);
                return;

            }
            String pstr = map[digits.charAt(index) - '0'];
            for (int i = 0; i < pstr.length(); i++) {
                combation(digits, letter + pstr.charAt(i), index + 1);
            }

        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}