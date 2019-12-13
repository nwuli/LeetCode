//给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
//
// 注意：答案中不可以包含重复的三元组。 
//
// 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//满足要求的三元组集合为：
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]
// 
// Related Topics 数组 双指针

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        Solution solution = new ThreeSum().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            if (nums.length < 3) return result;
            //快速排序
            quicksort(nums, 0, nums.length - 1);
            for (int i = 0; i < nums.length - 2; i++) {
                if (nums[i] > 0) break;
                if (i > 0 && nums[i] == nums[i - 1]) continue;
                int start = i + 1, end = nums.length - 1;
                while (start < end) {
                    int sum = nums[i] + nums[start] + nums[end];
                    if (sum == 0) {

                        List<Integer> tmp = new ArrayList<>();
                        tmp.add(nums[i]);
                        tmp.add(nums[start]);
                        tmp.add(nums[end]);
                        result.add(tmp);
                        //去除重复元素
                        while (start < end && nums[start] == nums[++start]) ;
                        while (start < end && nums[end] == nums[--end]) ;

                    } else if (sum > 0) {
                        while (start < end && nums[end] == nums[--end]) ;


                    } else {
                        while (start < end && nums[start] == nums[++start]) ;
                    }
                }

            }
            return result;

        }

        public void quicksort(int[] array, int start, int end) {
            int i = start;
            int j = end;
            if (start > end) return;
            int base = array[start];
            while (i < j) {
                while (array[j] >= base && j > i) {
                    j--;
                }
                while (array[i] <= base && i < j) {
                    i++;
                }
                if (i < j) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
            array[start] = array[i];
            array[i] = base;
            quicksort(array, start, i - 1);
            quicksort(array, i + 1, end);

        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}