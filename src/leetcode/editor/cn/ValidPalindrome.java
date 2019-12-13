//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
//
// 说明：本题中，我们将空字符串定义为有效的回文串。 
//
// 示例 1: 
//
// 输入: "A man, a plan, a canal: Panama"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "race a car"
//输出: false
// 
// Related Topics 双指针 字符串

package leetcode.editor.cn;

public class ValidPalindrome {
    public static void main(String[] args) {
        Solution solution = new ValidPalindrome().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPalindrome(String s) {
            if (s.length() == 0) return true;
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if ('a' - '0' <= s.charAt(i) - '0' && s.charAt(i) - '0' <= 'z' - '0' || 'A' - '0' <= s.charAt(i) - '0' && s.charAt(i) - '0' <= 'Z' - '0') {
                    stringBuilder.append(Character.toLowerCase(s.charAt(i)));
                }
                if (0 <= s.charAt(i) - '0' && s.charAt(i) - '0' <= 9) {
                    stringBuilder.append(s.charAt(i));

                }

            }

            int j = 0, k = stringBuilder.length() - 1;
            while (j <= k) {
                if (stringBuilder.charAt(j) != stringBuilder.charAt(k)) {
                    return false;
                }
                j++;
                k--;

            }
            return true;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}