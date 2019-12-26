//给定一个整数数组和一个整数 k，你需要找到该数组中和为 k 的连续的子数组的个数。
//
// 示例 1 : 
//
// 
//输入:nums = [1,1,1], k = 2
//输出: 2 , [1,1] 与 [1,1] 为两种不同的情况。
// 
//
// 说明 : 
//
// 
// 数组的长度为 [1, 20,000]。 
// 数组中元素的范围是 [-1000, 1000] ，且整数 k 的范围是 [-1e7, 1e7]。 
// 
// Related Topics 数组 哈希表

package leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        Solution solution = new SubarraySumEqualsK().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
//        public int subarraySum(int[] nums, int k) {
//            //动态规划,超时
//            int count = 0;
//            int[][] dp = new int[nums.length][nums.length];
//            for (int i = 0; i < nums.length - 1; i++) {
//                dp[i][i + 1] = nums[i] + nums[i + 1];
//                dp[i][i] = nums[i];
//                if (nums[i] == k) count++;
//                if (dp[i][i + 1] == k) count++;
//
//
//            }
//            dp[nums.length - 1][nums.length - 1] = nums[nums.length - 1];
//            if (nums[nums.length - 1] == k) count++;
//            for (int len = 2; len <= nums.length; len++) {
//                for (int start = 0; start < nums.length; start++) {
//                    int end = start + len;
//                    if (end < nums.length) {
//                        dp[start][end] = dp[start][end - 1] + nums[end];
//                        if (dp[start][end] == k) count++;
//                    }
//                }
//            }
//            return count;
//
//
//        }

        public int subarraySum(int[] nums, int k) {
            //两式相减
            HashMap<Integer, Integer> map = new HashMap<>();
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                int sum = 0;
                for (int j = i; j < nums.length; j++) {
                    sum = sum + nums[j];
                    if (sum == k)
                        count++;
                }
            }
            return count;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}