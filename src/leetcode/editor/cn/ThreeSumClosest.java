//给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
//
// 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
//
//与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
// 
// Related Topics 数组 双指针

package leetcode.editor.cn;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        Solution solution = new ThreeSumClosest().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            //假设存在答案了，唯一
            int result = 0;
            float tmp = Float.MAX_VALUE;
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 2; i++) {
                //其实这个不用加上
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int start = i + 1, end = nums.length - 1;
                while (start < end) {
                    int sum = nums[i] + nums[start] + nums[end];
                    int net = Math.abs(sum - target);
                    if (net < tmp) {
                        tmp = net;
                        result = sum;
                    }
                    if (sum > target) {
                        end--;
                    } else
                        start++;
                }
            }
            return result;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}