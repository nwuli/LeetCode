//给定一个没有重复数字的序列，返回其所有可能的全排列。
//
// 示例: 
//
// 输入: [1,2,3]
//输出:
//[
//  [1,2,3],
//  [1,3,2],
//  [2,1,3],
//  [2,3,1],
//  [3,1,2],
//  [3,2,1]
//] 
// Related Topics 回溯算法

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        Solution solution = new Permutations().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
//        public List<List<Integer>> permute(int[] nums) {
//            List<List<Integer>> result = new ArrayList<>();
//            List<Integer> tmp = new ArrayList<>();
//            if (nums.length == 0 || nums == null) return result;
//            backtrack(result, tmp, nums, nums.length);
//            return result;
//        }
//
//        public void backtrack(List<List<Integer>> result, List<Integer> tmp, int[] nums, int index) {
//            if (index == 0) {
//                List<Integer> t = new ArrayList<>();
//                t.addAll(tmp);
//                result.add(t);
//                return;
//            }
//            if (index > 0) {
//                for (int j = 0; j < nums.length; j++) {
//                    if (tmp.contains(nums[j])) continue;
//                    tmp.add(nums[j]);
//                    index = index - 1;
//                    backtrack(result, tmp, nums, index);
//                    tmp.remove(Integer.valueOf(nums[j]));
//                    index = index + 1;
//                }
//            }
//        }

        public List<List<Integer>> permute(int[] nums) {

            List<List<Integer>> result = new ArrayList<>();
            List<Integer> tmp = new ArrayList<>();
            List<Integer> base = new ArrayList<>();
            Arrays.stream(nums).forEach(base::add);
            if (nums.length == 0 || nums == null) return result;
            backtrack(result, tmp, base);
            return result;
        }

        public void backtrack(List<List<Integer>> result, List<Integer> tmp, List<Integer> base) {
            if (base.size() == 0) {
                result.add(new ArrayList<>(tmp));
                return;
            }
            if (base.size() > 0) {
                for (Integer integer : base) {
                    List<Integer> tbase = new ArrayList<>(base);
                    tbase.remove(integer);
                    tmp.add(integer);
                    backtrack(result, tmp, tbase);
                    //回退
                    tmp.remove(tmp.size() - 1);
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}