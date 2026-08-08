package BinaryTree.problems;

import BinaryTree.core.TreeBuilder;
import BinaryTree.core.TreeNode;

class AbsoluteDifference {
    TreeNode prev;
    int minDiff = Integer.MAX_VALUE;
    public void inorder(TreeNode node){
        if(node == null){
            return;
        } 
        inorder(node.left);

        if(prev != null){
            minDiff = Math.min(minDiff, Math.absExact(prev.val-node.val));
        }
        prev = node;
        inorder(node.right);
    }
    public int getMinimumDifference(TreeNode root) {
        if(root == null){
            return 0;
        }
        inorder(root);
        return minDiff;        
    }



    public static void main(String[] args) {
        Integer[] arr = {90,69,null,49,89,null,52};
        TreeNode root = TreeBuilder.buildTree(arr);
        AbsoluteDifference obj = new AbsoluteDifference();
        int result = obj.getMinimumDifference(root);
        System.out.println("Sum of root-to-leaf numbers: " + result);
    }
}
