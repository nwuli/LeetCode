//给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
//
// 说明：解集不能包含重复的子集。 
//
// 示例: 
//
// 输入: nums = [1,2,3]
//输出:
//[
//  [3],
//  [1],
//  [2],
//  [1,2,3],
//  [1,3],
//  [2,3],
//  [1,2],
//  []
//] 
// Related Topics 位运算 数组 回溯算法

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        Solution solution = new Subsets().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> tmp = new ArrayList<>();
            if (nums.length == 0 || nums == null) return res;
            backtrack(res, tmp, nums, 0);
            res.add(new ArrayList<>());
            return res;
        }

        public void backtrack(List<List<Integer>> res, List<Integer> tmp, int[] nums, int i) {
            for (int j = i; j < nums.length; j++) {
                tmp.add(nums[j]);
                res.add(new ArrayList<>(tmp));
                backtrack(res, tmp, nums, j + 1);
                tmp.remove(tmp.size() - 1);

            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}