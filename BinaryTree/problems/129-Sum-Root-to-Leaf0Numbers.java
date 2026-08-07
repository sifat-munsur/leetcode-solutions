package BinaryTree.problems;

import BinaryTree.core.TreeBuilder;
import BinaryTree.core.TreeNode;

class Solution {

    int dfs(TreeNode node, int current) {
        if (node == null) return 0;
        current = current * 10 + node.val;
        if (node.left == null && node.right == null) {
            return current;
        }
        return dfs(node.left, current) + dfs(node.right, current);
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3};

        TreeNode root = TreeBuilder.buildTree(arr);

        Solution obj = new Solution();
        int result = obj.dfs(root, 0);

        System.out.println("Sum of root-to-leaf numbers: " + result);
    }
}