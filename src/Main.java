
import java.util.HashMap;

public class Main {
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
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        new Main().merge(nums1, 3, nums2, 3);
        System.out.println("done");

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] result = new int[m + n];
        while (i < m && j < n && k < m + n) {
            if (nums1[i] < nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }


        }
        if (i == m) {
            while (j < n) {
                result[k++] = nums2[j++];
            }
        } else {
            while (i < m) {
                result[k++] = nums1[i++];
            }
        }
        int p = 0;
        while (p < result.length) {
            nums1[p] = result[p];
            p++;

        }


    }

}



