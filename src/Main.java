
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
        ListNode listNode2 = new Main().new ListNode(0);
        ListNode listNode3 = new Main().new ListNode(1);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = null;

        int[] array = new int[]{1, 1, 2, 2};
        List<List<Integer>> result = new Main().permuteUnique(array);
        System.out.println("done");

    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        //我们可以用一个列表来封装我们的带选项集合
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        List<Integer> base = new ArrayList<>();
        Arrays.stream(nums).forEach(base::add);
        if (nums.length == 0 || base == null) return result;
        backtrack(result, base, tmp, 0);
        return result;
    }

    public void backtrack(List<List<Integer>> result, List<Integer> base, List<Integer> tmp, int i) {
        if (base.size() == 0) {
            List<Integer> t = new ArrayList<>();
            t.addAll(tmp);
            result.add(t);
            return;
        }
        if (base.size() > 0) {
            for (int j = 0; j < base.size(); j++) {
                //如何去除重复元素
                if (j > 0 && base.get(j) == base.get(j - 1)) continue;
                List<Integer> tbase = new ArrayList<>(base);
                tmp.add(base.get(j));
                tbase.remove(base.get(j));
                backtrack(result, tbase, tmp, j);
                //回退最后一个元素
                tmp.remove(tmp.size() - 1);
            }
        }

    }


}




