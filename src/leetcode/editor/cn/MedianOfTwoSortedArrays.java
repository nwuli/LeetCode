//给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。 
//
// 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。 
//
// 你可以假设 nums1 和 nums2 不会同时为空。 
//
// 示例 1: 
//
// nums1 = [1, 3]
//nums2 = [2]
//
//则中位数是 2.0
// 
//
// 示例 2: 
//
// nums1 = [1, 2]
//nums2 = [3, 4]
//
//则中位数是 (2 + 3)/2 = 2.5
// 
// Related Topics 数组 二分查找 分治算法

package leetcode.editor.cn;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Solution solution = new MedianOfTwoSortedArrays().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //O(m+n)时间复杂度，没有利用到数组有序的情况
//        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//            int i = 0;
//            int j = 0;
//            int index = 0;
//            int premedia = 0;
//            int media = 0;
//            while (index <= (nums1.length + nums2.length) / 2) {//遍历得次数
//                if (i < nums1.length && (j >= nums2.length || nums1[i] < nums2[j])) {//注意这里的逻辑顺序
//                    premedia = media;
//                    media = nums1[i];
//                    i++;
//                } else {
//                    premedia = media;
//                    media = nums2[j];
//                    j++;
//                }
//                index++;
//            }
//            if ((nums1.length + nums2.length) % 2 == 0) {
//                return (premedia + media) / 2.0;
//            } else return media;
//        }
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int start1 = 0;
            int start2 = 0;
            int length1 = nums1.length;
            int lenght2 = nums2.length;
            int k1 = (lenght2 + length1+1) / 2;//第k小数据
            int k2 = (lenght2 + length1+2) / 2 ;//第k+小数据
            //如果是奇数，上面结果一样，偶数不一样
            return (getKMin(start1, length1 - 1, nums1, start2, lenght2 - 1, nums2, k1) + getKMin(start1, length1 - 1, nums1, start2, lenght2 - 1, nums2, k2)) * 0.5;
        }

        public int getKMin(int start1, int end1, int[] nums1, int start2, int end2, int[] nums2, int k) {
            int length1 = end1 - start1 + 1;
            int lenght2 = end2 - start2 + 1;
            //保证length1<length2
            if (length1 > lenght2) {
                return getKMin(start2, end2, nums2, start1, end1, nums1, k);
            }
            if (end1 - start1 + 1 == 0) {
                return nums2[start2 + k - 1];
            }
            if (k == 1) {
                return Math.min(nums1[start1], nums2[start2]);
            }
            //确定中间位置(不是第几个，下标值)
            int i = start1 + Math.min(k / 2, end1 - start1 + 1) - 1;
            int j = start2 + Math.min(k / 2, end2 - start2 + 1) - 1;
            if (nums1[i] < nums2[j]) {
                k = k - (i - start1 + 1);
                start1 = i + 1;

                return getKMin(start1, end1, nums1, start2, end2, nums2, k);
            } else {
                k = k - (j - start2 + 1);
                start2 = j + 1;

                return getKMin(start1, end1, nums1, start2, end2, nums2, k);
            }


        }
    }


//leetcode submit region end(Prohibit modification and deletion)

}