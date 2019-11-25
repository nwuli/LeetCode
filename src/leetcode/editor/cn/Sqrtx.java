//实现 int sqrt(int x) 函数。
//
// 计算并返回 x 的平方根，其中 x 是非负整数。 
//
// 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。 
//
// 示例 1: 
//
// 输入: 4
//输出: 2
// 
//
// 示例 2: 
//
// 输入: 8
//输出: 2
//说明: 8 的平方根是 2.82842..., 
//     由于返回类型是整数，小数部分将被舍去。
// 
// Related Topics 数学 二分查找

package leetcode.editor.cn;

public class Sqrtx {
    public static void main(String[] args) {
        Solution solution = new Sqrtx().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int mySqrt(int x) {
            //基本类型的表示范围
            long start = 0;
            long end = x - 1;
            long mid = 0;
            if (x == 1) return 1;
            if (x == 0) return 0;
            while (end >= start) {
                mid = (start + end) / 2;
                //找到直接返回
                if ((mid * mid - x) <= 0 && ((mid + 1) * (mid + 1) - x > 0))
                    return (int) mid;
                if (mid * mid < x) {
                    start = mid + 1;
                } else
                    end = mid - 1;
            }

            return (int) mid;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}