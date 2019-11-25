//给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
//
// 示例 1: 
//
// 输入: 1->1->2
//输出: 1->2
// 
//
// 示例 2: 
//
// 输入: 1->1->2->3->3
//输出: 1->2->3 
// Related Topics 链表

package leetcode.editor.cn;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        Solution solution = new RemoveDuplicatesFromSortedList().new Solution();
    }


//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {//这个已经在leetcode上通过

        public MergeTwoSortedLists.Solution.ListNode deleteDuplicates(MergeTwoSortedLists.Solution.ListNode head) {
            MergeTwoSortedLists.Solution.ListNode p = head;
            MergeTwoSortedLists.Solution.ListNode q = p.next;
            if (head == null)
                return head;
            while (q != null) {
                if (p.val == q.val) {
                    p.next = q.next;
                    q = p.next;
                } else {
                    p = p.next;
                    q = p.next;
                }
            }
            return head;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}