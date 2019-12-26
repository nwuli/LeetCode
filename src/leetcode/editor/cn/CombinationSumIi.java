//给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
//
// candidates 中的每个数字在每个组合中只能使用一次。 
//
// 说明： 
//
// 
// 所有数字（包括目标数）都是正整数。 
// 解集不能包含重复的组合。 
// 
//
// 示例 1: 
//
// 输入: candidates = [10,1,2,7,6,1,5], target = 8,
//所求解集为:
//[
//  [1, 7],
//  [1, 2, 5],
//  [2, 6],
//  [1, 1, 6]
//]
// 
//
// 示例 2: 
//
// 输入: candidates = [2,5,2,1,2], target = 5,
//所求解集为:
//[
//  [1,2,2],
//  [5]
//] 
// Related Topics 数组 回溯算法

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumIi {
    public static void main(String[] args) {
        Solution solution = new CombinationSumIi().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<Integer> tmp = new ArrayList<>();
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(candidates);
            if (candidates.length == 0 || candidates == null) return result;
            backtrack(result, tmp, candidates, target, 0);
            return result;

        }

        public void backtrack(List<List<Integer>> result, List<Integer> tmp, int[] candidates, int target, int i) {
            if (target == 0) {
                List<Integer> t = new ArrayList<>();
                t.addAll(tmp);
                result.add(t);
                return;
            }
            if (target > 0) {
                for (int j = i; j < candidates.length; j++) {
                    //如何去除重复元素：排序+连续跳过
                    if (j > i && candidates[j] == candidates[j - 1]) continue;
                    tmp.add(Integer.valueOf(candidates[j]));
                    backtrack(result, tmp, candidates, target - candidates[j], j + 1);
                    tmp.remove(Integer.valueOf(candidates[j]));
                }
            }

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}