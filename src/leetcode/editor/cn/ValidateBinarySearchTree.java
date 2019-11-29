//给定一个二叉树，判断其是否是一个有效的二叉搜索树。
//
// 假设一个二叉搜索树具有如下特征： 
//
// 
// 节点的左子树只包含小于当前节点的数。 
// 节点的右子树只包含大于当前节点的数。 
// 所有左子树和右子树自身必须也是二叉搜索树。 
// 
//
// 示例 1: 
//
// 输入:
//    2
//   / \
//  1   3
//输出: true
// 
//
// 示例 2: 
//
// 输入:
//    5
//   / \
//  1   4
//     / \
//    3   6
//输出: false
//解释: 输入为: [5,1,4,null,null,3,6]。
//     根节点的值为 5 ，但是其右子节点值为 4 。
// 
// Related Topics 树 深度优先搜索

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidateBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new ValidateBinarySearchTree().new Solution();
    }


//leetcode submit region begin(Prohibit modification and deletion)

    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public boolean isValidBST1(TreeNode root) {
            //可以前序遍历，看下我们的结果是否递增序列

            List<Integer> result = new ArrayList<>();
            result = deep(root);
            System.out.println(result);
            for (int i = 0; i < result.size() - 1; i++) {
                if (result.get(i).intValue() >= result.get(i + 1).intValue())
                    return false;
            }
            return true;

        }

        public List<Integer> deep(TreeNode root) {

            List<Integer> tmp = new ArrayList<>();
            if (root != null) {
                tmp.addAll(deep(root.left));
                tmp.add(root.val);
                tmp.addAll(deep(root.right));
                return tmp;
            }
            return tmp;
        }

        public boolean isValidBST(TreeNode root) {
            //用栈实现
            double min = -Double.MAX_VALUE;
            Stack<TreeNode> stack = new Stack<>();
            while (!stack.isEmpty() || root != null) {
                while (root != null) {
                    stack.push(root);
                    root = root.left;
                }
                root = stack.pop();
                if (root.val > min) {
                    min = root.val;
                    root = root.right;


                } else
                    return false;

            }
            return true;

        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}