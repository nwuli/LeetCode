//给定一个可包含重复数字的序列，返回所有不重复的全排列。
//
// 示例: 
//
// 输入: [1,1,2]
//输出:
//[
//  [1,1,2],
//  [1,2,1],
//  [2,1,1]
//] 
// Related Topics 回溯算法

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermutationsIi {
    public static void main(String[] args) {
        Solution solution = new PermutationsIi().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> permuteUnique(int[] nums) {
            //我们可以用一个列表来封装我们的带选项集合
            Arrays.sort(nums);
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> tmp = new ArrayList<>();
            List<Integer> base = new ArrayList<>();
            Arrays.stream(nums).forEach(base::add);
            if (nums.length == 0 || base == null) return result;
            backtrack(result, base, tmp, 0);
            return result;
        }

        public void backtrack(List<List<Integer>> result, List<Integer> base, List<Integer> tmp, int i) {
            if (base.size() == 0) {
                List<Integer> t = new ArrayList<>();
                t.addAll(tmp);
                result.add(t);
                return;
            }
            if (base.size() > 0) {
                for (int j = 0; j < base.size(); j++) {
                    //如何去除重复元素
                    if (j > 0 && base.get(j) == base.get(j - 1)) continue;
                    List<Integer> tbase = new ArrayList<>(base);
                    tmp.add(base.get(j));
                    tbase.remove(base.get(j));
                    backtrack(result, tbase, tmp, j);
                    //回退最后一个元素
                    tmp.remove(tmp.size() - 1);
                }
            }

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}