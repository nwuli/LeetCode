//将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 示例： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4
// 
// Related Topics 链表

package leetcode.editor.cn;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        Solution solution = new MergeTwoSortedLists().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public class ListNode {
            int val;
            ListNode next;

            ListNode(int x) {
                val = x;
            }
        }

        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode p = new ListNode(0);
            ListNode pnode = p;
            while (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    pnode.next = l1;
                    l1 = l1.next;
                    pnode = pnode.next;
                } else {
                    pnode.next = l2;
                    l2 = l2.next;
                    pnode = pnode.next;
                }
            }
            if (l1 == null) {
                pnode.next = l2;
            } else {
                pnode.next = l1;
            }
            return p.next;
        }

    }

//leetcode submit region end(Prohibit modification and deletion)

}