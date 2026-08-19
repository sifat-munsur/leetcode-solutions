package DFS.problems;

import DFS.build.*;
import java.util.ArrayList;
import java.util.List;

class LeafSimilarTrees {

    

    public List<Integer> leaf(TreeNode root, List<Integer> list){
        if (root == null){
            return list;
        }
        if (root.left == null && root.right == null) {
            list.add(root.val);
        }
        leaf(root.left,list);
        leaf(root.right, list);
        return list;
    }





    public static void main(String[] args) {
        // Integer[] arr1 = {3,5,1,6,2,9,8,null,null,7,4};
        // Integer[] arr2 = {3,5,1,6,7,4,2,null,null,null,null,null,null,9,8};

        Integer[] arr1 = {1,2,3};
        Integer[] arr2 = {1,3,2};

        TreeNode root1 = TreeBuilder.buildTree(arr1);
        TreeNode root2 = TreeBuilder.buildTree(arr2);

        LeafSimilarTrees obj = new LeafSimilarTrees();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1 = obj.leaf(root1, new ArrayList<>());
        list2 = obj.leaf(root2,  new ArrayList<>());
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1.equals(list2));
        
    }    
}
