//给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
//
// 
//
// 在杨辉三角中，每个数是它左上方和右上方的数的和。 
//
// 示例: 
//
// 输入: 5
//输出:
//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//] 
// Related Topics 数组

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        Solution solution = new PascalsTriangle().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> tmp = new ArrayList<>();
            List<Integer> pretmp = new ArrayList<>();
            if (numRows == 0) return result;
            tmp.add(1);
            pretmp.addAll(tmp);
            result.add(tmp);
            for (int i = 1; i < numRows; i++) {
                List<Integer> tp = new ArrayList<>();
                tp.add(1);
                for (int j = 0; j < pretmp.size() - 1; j++) {
                    tp.add(pretmp.get(j) + pretmp.get(j + 1));
                }
                tp.add(1);

                result.add(tp);
                pretmp.clear();
                pretmp.addAll(tp);

            }
            return result;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}