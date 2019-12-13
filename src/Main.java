
import leetcode.editor.cn.ValidateBinarySearchTree;

import java.util.ArrayList;
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
        ListNode listNode2 = new Main().new ListNode(0);
        ListNode listNode3 = new Main().new ListNode(1);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = null;

        int[] array = new int[]{1,0,-1,0,-2,2};
        new Main().quicksort(array, 0, array.length - 1);
        System.out.println("done");

    }

    public void quicksort(int[] array, int start, int end) {
        if (start > end) return;
        int i = start;
        int j = end;
        int base = array[start];
        while (i < j) {
            while (array[j] >= base && i < j) {
                j--;
            }
            while (array[i] <= base && i < j) {
                i++;
            }

            if (i < j) {
                //替换
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        array[start] = array[i];
        array[i] = base;
        quicksort(array, 0, i - 1);
        quicksort(array, i + 1, end);
    }


}



