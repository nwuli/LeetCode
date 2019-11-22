
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
        System.out.println("done");

    }


}



