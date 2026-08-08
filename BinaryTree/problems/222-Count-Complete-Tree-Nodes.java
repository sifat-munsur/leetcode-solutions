package BinaryTree.problems;

import BinaryTree.core.TreeBuilder;
import BinaryTree.core.TreeNode;
class CountCompleteTree {

    int getLeftHeight(TreeNode node){
        int h = 0;
        while(node != null){
            h++;
            node = node.left;
        }
        return h;
    }
    int getRightHeight(TreeNode node){
        int h = 0;
        while(node != null){
            h++;
            node = node.right;
        }
        return h;
    }

    int countNode(TreeNode root){

        if(root == null){
            return 0;
        }

        int leftHeight = getLeftHeight(root);
        int rightHeight = getRightHeight(root);

        if(leftHeight == rightHeight){
            return ((int)Math.pow(2, leftHeight)-1);
        }

        return 1 + countNode(root.left) + countNode(root.right);
    }


    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6};
        TreeNode root = TreeBuilder.buildTree(arr);

        CountCompleteTree obj = new CountCompleteTree();
        int result = obj.countNode(root);

        System.out.println("Sum of root-to-leaf numbers: " + result);
    }
}
