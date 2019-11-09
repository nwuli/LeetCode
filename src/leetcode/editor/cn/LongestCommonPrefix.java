//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 示例 1: 
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
// 
//
// 示例 2: 
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
// 
//
// 说明: 
//
// 所有输入只包含小写字母 a-z 。 
// Related Topics 字符串

package leetcode.editor.cn;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution solution = new LongestCommonPrefix().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            char target;
            String s = "";
            int j = 0;
            boolean flag = true;
            int count = Integer.MAX_VALUE;
            int minindex = 0;
            if (strs.length == 0) return s;
            for (int i = 0; i < strs.length; i++) {
                if (count > strs[i].length()) {
                    count = strs[i].length();
                    minindex = i;
                }
            }
            while (flag && j < count) {
                target = strs[minindex].charAt(j);
                for (int i = 0; i < strs.length; i++) {
                    if (strs[i].charAt(j) == target) {
                        continue;
                    } else {
                        flag = false;
                        break;
                    }

                }
                if (flag) {
                    s = s + target;
                    j++;
                }

            }
            return s;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}