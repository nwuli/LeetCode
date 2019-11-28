//给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
//
// 例如： 
//给定二叉树 [3,9,20,null,null,15,7], 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
// 
//
// 返回其自底向上的层次遍历为： 
//
// [
//  [15,7],
//  [9,20],
//  [3]
//]
// 
// Related Topics 树 广度优先搜索

package leetcode.editor.cn;

import java.util.*;

public class BinaryTreeLevelOrderTraversalIi {
    public static void main(String[] args) {
        Solution solution = new BinaryTreeLevelOrderTraversalIi().new Solution();
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
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            Stack<List<Integer>> stack = new Stack<>();
            if (root == null) return result;
            int size;
            queue.offer(root);
            while (!queue.isEmpty()) {
                int i = 0;
                List<Integer> levelresult = new ArrayList<>();
                size = queue.size();
                while (i < size) {
                    TreeNode p = queue.poll();
                    i++;
                    levelresult.add(p.val);
                    if (p.left != null)
                        queue.offer(p.left);
                    if (p.right != null)
                        queue.offer(p.right);
                }
                //进栈
                stack.push(levelresult);

            }
            while (!stack.isEmpty()) {
                List<Integer> tmp = stack.pop();
                result.add(tmp);
            }
            return result;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}