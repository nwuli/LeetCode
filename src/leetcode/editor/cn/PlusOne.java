//给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。 
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。 
//
// 示例 1: 
//
// 输入: [1,2,3]
//输出: [1,2,4]
//解释: 输入数组表示数字 123。
// 
//
// 示例 2: 
//
// 输入: [4,3,2,1]
//输出: [4,3,2,2]
//解释: 输入数组表示数字 4321。
// 
// Related Topics 数组

package leetcode.editor.cn;

public class PlusOne {
    public static void main(String[] args) {
        Solution solution = new PlusOne().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] plusOne(int[] digits) {
            //顶多进一位
            int len = digits.length;
            int ans = 1;
            int[] result = new int[digits.length + 1];
            for (int i = 0; i < digits.length; i++) {
                result[len - i] = (digits[len - i - 1] + ans) == 10 ? 0 : (digits[len - i - 1] + ans);
                ans = (digits[len - i - 1] + ans) / 10;

            }
            if (ans != 0) {
                result[0] = ans;
            }
            if (result[0] == 0) {
                for (int i = 1; i < result.length; i++) {
                    digits[i - 1] = result[i];
                }
                return digits;

            }
            return result;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}