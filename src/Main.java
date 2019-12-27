
import leetcode.editor.cn.SwapNodesInPairs;
import leetcode.editor.cn.ValidateBinarySearchTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] number = new int[2];
        number[0] = 2;
        number[1] = 2;
        map.put(Integer.valueOf(number[0]), 0);
        map.put(Integer.valueOf(number[1]), 1);
        System.out.println(map.size());
        //String result = new Main().countAndSay(5);
        String a = "110010";
        String b = "10111";
        //String num = new Main().addBinary(a, b);
        char c = a.charAt(0);
        int tc = Integer.valueOf(c);
        int tb = Integer.parseInt(String.valueOf(c));
        int te = c - '0';
        ListNode listNode1 = new Main().new ListNode(1);
        ListNode listNode2 = new Main().new ListNode(2);
        ListNode listNode3 = new Main().new ListNode(3);
        ListNode listNode4 = new Main().new ListNode(4);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        ListNode result = new Main().swapPairs(listNode1);
        System.out.println("done");

    }

    public ListNode swapPairs(ListNode head) {
        //需要3个节点
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
            if (slow.next == null) break;
            pre = slow;
            slow = slow.next;
            fast = slow.next;

        }

        return phead.next;

    }


}




