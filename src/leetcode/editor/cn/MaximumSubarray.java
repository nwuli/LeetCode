//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
//
// 示例: 
//
// 输入: [-2,1,-3,4,-1,2,1,-5,4],
//输出: 6
//解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
// 
//
// 进阶: 
//
// 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。 
// Related Topics 数组 分治算法 动态规划

package leetcode.editor.cn;

public class MaximumSubarray {
    public static void main(String[] args) {
        Solution solution = new MaximumSubarray().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //        public int maxSubArray(int[] nums) {
//            int max = Integer.MIN_VALUE;
//            int start = 0;
//            int end = 0;
//            int[] dp = new int[nums.length];
//            if (nums.length == 1) return nums[0];
//            dp[0] = nums[0];
//            for (int i = 1; i < nums.length; i++) {
//                if (nums[i] > nums[i] + dp[i - 1]) {
//                    dp[i] = nums[i];
//
//                } else {
//                    dp[i] = nums[i] + dp[i - 1];
//                }
//
//            }
//            for (int i = 0; i < nums.length; i++) {
//                max = max > dp[i] ? max : dp[i];
//            }
//
//            return max;
//
//        }
        public int maxSubArray(int[] nums) {
            int ans = nums[0];
            int sum = 0;
            for (int num : nums) {
                if (sum > 0) {
                    ans = sum + num;
                } else
                    sum = num;
                //加上当前值后进行比较，确定下次的sun值
                sum = Math.max(ans, num);
            }
            return sum;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}