//给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
//
// 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。 
//
// 说明: 
//
// 
// 返回的下标值（index1 和 index2）不是从零开始的。 
// 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。 
// 
//
// 示例: 
//
// 输入: numbers = [2, 7, 11, 15], target = 9
//输出: [1,2]
//解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。 
// Related Topics 数组 双指针 二分查找

package leetcode.editor.cn;

import java.util.HashMap;

public class TwoSumIiInputArrayIsSorted {
    public static void main(String[] args) {
        Solution solution = new TwoSumIiInputArrayIsSorted().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //        public int[] twoSum(int[] numbers, int target) {
//            //提前是有序数组
//            int[] result = new int[2];
//            HashMap<Integer, Integer> map = new HashMap<>();
//            for (int i = 0; i < numbers.length; i++) {
//                map.put(numbers[i], i);
//            }
//            for (int i = 0; i < numbers.length; i++) {
//                int rest = target - numbers[i];
//                if (map.containsKey(rest) && map.get(rest) != i) {
//                    result[0] = i + 1;
//                    result[1] = map.get(rest) + 1;
//                    break;
//
//                }
//            }
//            return result;
//
//        }
        public int[] twoSum(int[] numbers, int target) {
            //双指针做法
            int i = 0, j = numbers.length - 1;
            int[] result = new int[2];
            while (i < j) {
                int sum = numbers[i] + numbers[j];
                if (sum == target) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    break;
                } else if (sum > target) while (i < j && numbers[j] == numbers[--j]) ;
                else while (i < j && numbers[i] == numbers[++i]) ;
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}