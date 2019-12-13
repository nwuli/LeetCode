//请判断一个链表是否为回文链表。
//
// 示例 1: 
//
// 输入: 1->2
//输出: false 
//
// 示例 2: 
//
// 输入: 1->2->2->1
//输出: true
// 
//
// 进阶： 
//你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
// Related Topics 链表 双指针

package leetcode.editor.cn;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        Solution solution = new PalindromeLinkedList().new Solution();
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
        public boolean isPalindrome(ListNode head) {
            if (head == null || head.next == null) return true;
            ListNode slow = head, fast = head;
            ListNode pre = head;
            ListNode newhead = new ListNode(0);
            newhead.next = null;
            while (fast != null && fast.next != null) {
                pre = slow;
                slow = slow.next;
                fast = fast.next.next;
                pre.next = newhead.next;
                newhead.next = pre;

            }

            //fast节点和newhead头进行比较
            newhead = newhead.next;
            while (newhead != null && slow != null) {
                if (newhead.val != slow.val) {
                    return false;
                }
                newhead = newhead.next;
                slow = slow.next;
            }
            return true;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}