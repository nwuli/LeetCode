//给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。 
//
// 示例 1： 
//
// 输入: "babad"
//输出: "bab"
//注意: "aba" 也是一个有效答案。
// 
//
// 示例 2： 
//
// 输入: "cbbd"
//输出: "bb"
// 
// Related Topics 字符串 动态规划

package leetcode.editor.cn;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution solution = new LongestPalindromicSubstring().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestPalindrome(String s) {
            if (s.length() == 0) return "";
            int index1 = 0;
            int index2 = 0;
            int[][] dp = new int[s.length()][s.length()];
            for (int i = 0; i < s.length(); i++) {
                //初始化所有长度为1、2的动态矩阵
                dp[i][i] = 1;
                if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                    dp[i][i + 1] = 1;
                    index1 = i;
                    index2 = i + 1;
                }
            }
            for (int len = 3; len <= s.length(); len++) {//[0][0]和[0][1]已经处理，从3开始
                //保证i+j<length的自由组合，注意i,j的位置
                for (int start = 0; start < s.length(); start++) {
                    int end = start + len - 1;//结束位置超过最大长度
                    if (end > s.length() - 1) {
                        break;
                    }
                    if (dp[start + 1][end - 1] == 1 && (s.charAt(start) == s.charAt(end))) {
                        dp[start][end] = 1;
                        index1 = start;
                        index2 = end;

                    }
                }

            }

            return s.substring(index1, index2 + 1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}