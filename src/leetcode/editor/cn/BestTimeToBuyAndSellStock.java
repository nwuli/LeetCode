//给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
//
// 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。 
//
// 注意你不能在买入股票前卖出股票。 
//
// 示例 1: 
//
// 输入: [7,1,5,3,6,4]
//输出: 5
//解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
//     注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
// 
//
// 示例 2: 
//
// 输入: [7,6,4,3,1]
//输出: 0
//解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
// 
// Related Topics 数组 动态规划

package leetcode.editor.cn;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Solution solution = new BestTimeToBuyAndSellStock().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /* 解法1
        public int maxProfit(int[] prices) {
            //dp表示i,j这段时间的最大利润
            int max = 0;
            if (prices.length == 0) return max;
            int[][] dp = new int[prices.length][prices.length];
            for (int i = 0; i < prices.length - 1; i++) {
                dp[i][i] = 0;
                dp[i][i + 1] = prices[i + 1] - prices[i];
                max = dp[i][i + 1] > max ? dp[i][i + 1] : max;
            }
            dp[prices.length - 1][prices.length - 1] = 0;

            for (int len = 2; len <= prices.length; len++) {
                for (int start = 0; start < prices.length; start++) {
                    if (start + len >= prices.length) {
                        break;
                    }
                    int end = start + len;

                    if ((prices[end] - prices[start]) > dp[start + 1][end - 1]) {
                        dp[start][end] = (prices[end] - prices[start]);
                    } else {
                        dp[start][end] = dp[start + 1][end - 1];

                    }
                    max = dp[start][end] > max ? dp[start][end] : max;
                }

            }
            return (int) max;

        }

        //解法2

        public int maxProfit(int[] prices) {
            if (prices.length == 0) return 0;
            int[] diff = new int[prices.length - 1];
            int max;
            for (int i = 0; i < prices.length - 1; i++) {
                diff[i] = prices[i + 1] - prices[i];
            }
            int[] dp = new int[diff.length];
            dp[0] = diff[0];
            max = dp[0];
            for (int i = 1; i < diff.length; i++) {
                dp[i] = dp[i - 1] + diff[i] > diff[i] ? dp[i - 1] + diff[i] : diff[i];
                max = max > dp[i] ? max : dp[i];
            }
            return max;


        }
        */

        //解法3
        public int maxProfit(int[] prices) {
            if (prices.length == 0) return 0;
            int[][] dp = new int[prices.length][2];
            for (int i = 0; i < prices.length; i++) {
                if (i == 0) {
                    //没买了股票
                    dp[i][0] = 0;
                    //买了股票
                    dp[i][1] = -prices[i];
                    continue;
                }

                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
                dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);
            }
            return dp[prices.length - 1][0];


        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}