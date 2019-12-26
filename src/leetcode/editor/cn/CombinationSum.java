//给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
//
// candidates 中的数字可以无限制重复被选取。 
//
// 说明： 
//
// 
// 所有数字（包括 target）都是正整数。 
// 解集不能包含重复的组合。 
// 
//
// 示例 1: 
//
// 输入: candidates = [2,3,6,7], target = 7,
//所求解集为:
//[
//  [7],
//  [2,2,3]
//]
// 
//
// 示例 2: 
//
// 输入: candidates = [2,3,5], target = 8,
//所求解集为:
//[
//  [2,2,2,2],
//  [2,3,3],
//  [3,5]
//] 
// Related Topics 数组 回溯算法

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        Solution solution = new CombinationSum().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> result = new ArrayList<>();
            if (candidates.length == 0 || candidates == null) return result;
            List<Integer> tmp = new ArrayList<>();
            backtrack(result, tmp, 0, target, candidates, 0);
            return result;

        }

        public void backtrack(List<List<Integer>> result, List<Integer> tmp, int sum, int target, int[] candidates, int j) {
            if (sum == target) {
                List<Integer> t = new ArrayList<>(tmp);
                result.add(t);
                tmp.remove(Integer.valueOf(candidates[j]));
                sum = sum - candidates[j];
                return;
            }
            if (sum < target) {
                for (int i = j; i < candidates.length; i++) {
                    tmp.add(Integer.valueOf(candidates[i]));
                    backtrack(result, tmp, sum + candidates[i], target, candidates, i);
                }

            }
            tmp.remove(Integer.valueOf(candidates[j]));
            sum = sum - candidates[j];


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}