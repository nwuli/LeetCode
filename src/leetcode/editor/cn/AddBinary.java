//给定两个二进制字符串，返回他们的和（用二进制表示）。
//
// 输入为非空字符串且只包含数字 1 和 0。 
//
// 示例 1: 
//
// 输入: a = "11", b = "1"
//输出: "100" 
//
// 示例 2: 
//
// 输入: a = "1010", b = "1011"
//输出: "10101" 
// Related Topics 数学 字符串

package leetcode.editor.cn;

public class AddBinary {
    public static void main(String[] args) {
        Solution solution = new AddBinary().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String addBinary(String a, String b) {
            String result = "";
            int ans = 0;
            int len1 = a.length();
            int len2 = b.length();
            int len = (len1 > len2) ? len1 : len2;
            for (int i = 0; i < len; i++) {
                //int t = (int)(String.valueOf(a.charAt(0)));
                if ((len1 - i - 1 >= 0) && (len2 - i - 1) >= 0) {
                    result = (ans + a.charAt(len1 - i - 1) - '0' + b.charAt(len2 - i - 1) - '0') % 2 + result;
                    ans = (ans + a.charAt(len1 - i - 1) - '0' + b.charAt(len2 - i - 1) - '0') / 2;
                } else if (len1 - i - 1 < 0) {
                    result = (b.charAt(len2 - i - 1) - '0' + ans) % 2 + result;
                    ans = (b.charAt(len2 - i - 1) - '0' + ans) / 2;

                } else {
                    result = (a.charAt(len1 - i - 1) - '0' + ans) % 2 + result;
                    ans = (a.charAt(len1 - i - 1) - '0' + ans) / 2;
                }
            }
            if (ans == 1) {
                result = '1' + result;
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}