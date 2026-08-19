package DFS.problems;

import DFS.build.*;
import java.util.*;

class IncreasingOrderSearchTree {
    
    public List<Integer> getNode(TreeNode root, List<Integer> list){
        if (root == null){
            return list;
        }
        getNode(root.left,list);
        list.add(root.val);
        getNode(root.right, list);
        return list;
    }

    public static void main(String[] args) {
        Integer[] arr = {5,3,6,2,4,null,8,1,null,null,null,7,9};
        TreeNode root = TreeBuilder.buildTree(arr);

        IncreasingOrderSearchTree obj = new IncreasingOrderSearchTree();

        List<Integer> list = new ArrayList<>();
        list = obj.getNode(root, new ArrayList<>());
        System.out.println(list);
        
        
        TreeNode dummy = new TreeNode(0);
        TreeNode current = dummy;
        for(int value: list){
            current.right = new TreeNode(value);
            current = current.right;
        }

        TreeNode root1 = dummy.right;

        TreePrint.printTree(root1);
        System.out.println();
    }
}
