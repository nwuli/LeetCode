//报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
//
// 1.     1
//2.     11
//3.     21
//4.     1211
//5.     111221
// 
//
// 1 被读作 "one 1" ("一个一") , 即 11。 
//11 被读作 "two 1s" ("两个一"）, 即 21。 
//21 被读作 "one 2", "one 1" （"一个二" , "一个一") , 即 1211。 
//
// 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。 
//
// 注意：整数顺序将表示为一个字符串。 
//
// 
//
// 示例 1: 
//
// 输入: 1
//输出: "1"
// 
//
// 示例 2: 
//
// 输入: 4
//输出: "1211"
// 
// Related Topics 字符串

package leetcode.editor.cn;

public class CountAndSay {
    public static void main(String[] args) {
        Solution solution = new CountAndSay().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String countAndSay(int n) {
            StringBuffer stringBuffer = new StringBuffer("1");
            StringBuffer nextString = new StringBuffer();
            for (int i = 0; i < n - 1; i++) {
                char c[] = stringBuffer.toString().toCharArray();
                int count = 1;
                boolean flag = false;
                for (int j = 0; j < c.length; j++) {
                    if (j == c.length - 1) {
                        //最后的元素处理
                        if (flag) {
                            nextString.append(String.valueOf(count) + c[j]);
                        } else {
                            count = 1;
                            nextString.append(String.valueOf(count) + c[j]);


                        }
                        break;

                    }
                    if (c[j] == c[j + 1]) {
                        count++;
                        flag = true;
                    } else {
                        flag = false;
                    }
                    if (!flag) {
                        nextString.append(String.valueOf(count) + c[j]);
                        count = 1;
                    }

                }
                //重置循环
                stringBuffer.setLength(0);
                stringBuffer.append(nextString.toString());
                nextString.setLength(0);
            }
            return stringBuffer.toString();

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}