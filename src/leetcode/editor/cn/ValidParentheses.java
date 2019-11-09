//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 注意空字符串可被认为是有效字符串。 
//
// 示例 1: 
//
// 输入: "()"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "()[]{}"
//输出: true
// 
//
// 示例 3: 
//
// 输入: "(]"
//输出: false
// 
//
// 示例 4: 
//
// 输入: "([)]"
//输出: false
// 
//
// 示例 5: 
//
// 输入: "{[]}"
//输出: true 
// Related Topics 栈 字符串
  
  package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidParentheses{
      public static void main(String[] args) {
           Solution solution = new ValidParentheses().new Solution();
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
        List<Character> Queue= new ArrayList<>();
        for(int i=0;i<s.length();i++){
            Queue.add(s.charAt(i));
            if(Queue.size()>1&&(Queue.get(Queue.size()-2).charValue()=='['&&Queue.get(Queue.size()-1).charValue()==']'||Queue.get(Queue.size()-2).charValue()=='{'&&Queue.get(Queue.size()-1).charValue()=='}'||Queue.get(Queue.size()-2).charValue()=='('&&Queue.get(Queue.size()-1).charValue()==')')){
                Queue.remove(Queue.size()-1);
                Queue.remove(Queue.size()-1);
            }
        }
        if (Queue.size()==0)return true;
        else return false;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }