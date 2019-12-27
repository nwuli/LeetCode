//给定一个可能包含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
//
// 说明：解集不能包含重复的子集。 
//
// 示例: 
//
// 输入: [1,2,2]
//输出:
//[
//  [2],
//  [1],
//  [1,2,2],
//  [2,2],
//  [1,2],
//  []
//] 
// Related Topics 数组 回溯算法

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsIi {
    public static void main(String[] args) {
        Solution solution = new SubsetsIi().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> tmp = new ArrayList<>();
            if (nums.length == 0 || nums == null) return res;
            backtrack(res, tmp, nums, 0);
            res.add(new ArrayList<>());
            return res;

        }

        public void backtrack(List<List<Integer>> res, List<Integer> tmp, int[] nums, int i) {
            for (int j = i; j < nums.length; j++) {
                if (j > i && nums[j] == nums[j - 1]) continue;
                tmp.add(nums[j]);
                res.add(new ArrayList<>(tmp));
                backtrack(res, tmp, nums, j + 1);
                tmp.remove(tmp.size() - 1);

            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}