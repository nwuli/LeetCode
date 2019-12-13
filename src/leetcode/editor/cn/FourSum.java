//给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
//
// 注意： 
//
// 答案中不可以包含重复的四元组。 
//
// 示例： 
//
// 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
//
//满足要求的四元组集合为：
//[
//  [-1,  0, 0, 1],
//  [-2, -1, 1, 2],
//  [-2,  0, 0, 2]
//]
// 
// Related Topics 数组 哈希表 双指针

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        Solution solution = new FourSum().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            //双指针方法
            List<List<Integer>> result = new ArrayList<>();
            //手写的快排超时，达不到要求，只能用Arrays.sort排序使用
            //quicksort(nums, 0, nums.length - 1);
            if (nums.length < 4) return result;
            for (int i = 0; i < nums.length - 3; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) continue;
                for (int j = i + 1; j < nums.length - 2; j++) {
                    if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                    int start = j + 1, end = nums.length - 1;
                    while (start < end) {
                        int sum = nums[i] + nums[j] + nums[start] + nums[end];
                        if (sum == target) {
                            result.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));

                            while (start < end && nums[start] == nums[++start]) ;
                            while (start < end && nums[end] == nums[--end]) ;

                        } else if (sum > target) {
                            while (start < end && nums[end] == nums[--end]) ;


                        } else {
                            while (start < end && nums[start] == nums[++start]) ;

                        }
                    }
                }
            }
            return result;


        }

//        public void quicksort(int[] array, int start, int end) {
//            if (start > end) return;
//            int i = start;
//            int j = end;
//            int base = array[start];
//            while (i < j) {
//                while (array[j] >= base && i < j) {
//                    j--;
//                }
//                while (array[i] <= base && i < j) {
//                    i++;
//                }
//
//                if (i < j) {
//                    //替换
//                    int temp = array[j];
//                    array[j] = array[i];
//                    array[i] = temp;
//                }
//            }
//            array[start] = array[i];
//            array[i] = base;
//            quicksort(array, 0, i - 1);
//            quicksort(array, i + 1, end);
//        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}