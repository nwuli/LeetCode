//给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
//
// 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。 
//
// 
//
// 示例: 
//
// 给定 1->2->3->4, 你应该返回 2->1->4->3.
// 
// Related Topics 链表

package leetcode.editor.cn;

public class SwapNodesInPairs {
    public static void main(String[] args) {
        Solution solution = new SwapNodesInPairs().new Solution();
    }


//leetcode submit region begin(Prohibit modification and deletion)

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode swapPairs(ListNode head) {
            //需要3个节点
            if (head == null) return null;
            ListNode phead = new ListNode(-1);
            phead.next = head;
            ListNode pre, fast, slow;
            pre = phead;
            slow = head;
            fast = head.next;
            while (fast != null) {
                slow.next = fast.next;
                pre.next = fast;
                fast.next = slow;
                pre = slow;
                if (slow.next == null) break;
                slow = slow.next;
                fast = slow.next;

            }

            return phead.next;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}