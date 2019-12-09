//给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
//
// 
//
// 在杨辉三角中，每个数是它左上方和右上方的数的和。 
//
// 示例: 
//
// 输入: 3
//输出: [1,3,3,1]
// 
//
// 进阶： 
//
// 你可以优化你的算法到 O(k) 空间复杂度吗？ 
// Related Topics 数组

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleIi {
    public static void main(String[] args) {
        Solution solution = new PascalsTriangleIi().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> getRow(int rowIndex) {
            List<Integer> pre = new ArrayList<>();
            pre.add(1);
            if (rowIndex == 0) return pre;
            for (int i = 1; i <= rowIndex; i++) {
                List<Integer> tmp = new ArrayList<>();

                tmp.add(1);
                for (int j = 0; j < pre.size() - 1; j++) {
                    tmp.add(pre.get(j) + pre.get(j + 1));
                }
                tmp.add(1);
                pre.clear();
                pre.addAll(tmp);


            }
            return pre;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}