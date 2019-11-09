//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。 
//
// 示例 1: 
//
// 输入: 123
//输出: 321
// 
//
// 示例 2: 
//
// 输入: -123
//输出: -321
// 
//
// 示例 3: 
//
// 输入: 120
//输出: 21
// 
//
// 注意: 
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。 
// Related Topics 数学

package leetcode.editor.cn;

public class ReverseInteger {
    public static void main(String[] args) {
        Solution solution = new ReverseInteger().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int reverse(int x) {
            int pop = x % 10;//最后一位
            int ans = 0;
            while (x != 0) {
                if (ans > Integer.MAX_VALUE / 10 || ans == Integer.MAX_VALUE && pop > 7) {
                    return 0;//正向溢出
                }
                if (ans < Integer.MIN_VALUE / 10 || ans == Integer.MIN_VALUE && pop < -8)
                    return 0;//负溢出
                ans = ans * 10 + pop;
                x = x / 10;
                pop = x % 10;
            }
            return ans;

//        public int reverse(int x) {
//            int num = 0;
//            boolean flag = (x < 0) ? false : true;
//            String s = String.valueOf(Math.abs(x));
//            char[] array = s.toCharArray();
//            for (int i = 0; i < array.length / 2; i++) {
//                if (i != array.length - 1 - i) {
//                    char temp = array[i];
//                    array[i] = array[array.length - 1 - i];
//                    array[array.length - 1 - i] = temp;
//                }
//            }
//
//            try {
//                num = flag ? Integer.parseInt(String.valueOf(array)) : -Integer.parseInt(String.valueOf(array));
//            } catch (NumberFormatException e) {
//                return num;
//            }
//
//            return num;
//
//        }


        }
    }

//leetcode submit region end(Prohibit modification and deletion)
}