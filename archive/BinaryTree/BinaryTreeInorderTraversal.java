package archive.BinaryTree;
import java.util.*;

public class BinaryTreeInorderTraversal {
    int val;    
    BinaryTreeInorderTraversal left, right;
    BinaryTreeInorderTraversal(int val){
        this.val = val;
    }
}

class BinaryTree{

    public BinaryTreeInorderTraversal buildTree(Integer[] arr){
        if (arr == null || arr.length == 0 || arr[0] == null){
            return null;
        } 
        BinaryTreeInorderTraversal root = new BinaryTreeInorderTraversal(arr[0]); 
        Queue<BinaryTreeInorderTraversal> queue = new LinkedList<>();
        queue.offer(root); 
        int i = 1;
        while (!queue.isEmpty() && i < arr.length){
            BinaryTreeInorderTraversal current = queue.poll();
            if (i < arr.length && arr[i] != null){
                current.left = new BinaryTreeInorderTraversal(arr[i]);
                queue.offer(current.left);
            }
            i++;
            if (i < arr.length && arr[i] != null){
                current.right = new BinaryTreeInorderTraversal(arr[i]);
                queue.offer(current.right); 
            } 
            i++;
        } 
        return root;
    }

    // List<Integer> inorderList = new ArrayList<>();
    // List<Integer> inorder(BinaryTreeInorderTraversal node){
    //     if(node==null){
    //         return new ArrayList<>();
    //     }
    //     inorder(node.left);
    //     inorderList.add(node.val);
    //     inorder(node.right);
    //     return inorderList;
    // }

    void inorder(BinaryTreeInorderTraversal node){
        // List<Integer> resultList = new ArrayList<>();
        int targetSum = 22;
        int totalSum = 0;
        Stack<BinaryTreeInorderTraversal> stack = new Stack<>();
        BinaryTreeInorderTraversal current = node;

        while(current != null || !stack.isEmpty()){
            while(current != null){
                totalSum += current.val;
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            // totalSum += current.val;
            if(current.left== null && current.right==null){
                if(totalSum==targetSum){
                    System.out.println(true);
                    break;
                }
                else{
                    System.out.println("Hello");
                    totalSum -= current.val;
                }
            }
            // resultList.add(current.val);
            current = current.right;
        }
        // return resultList;
    }



    List<Integer> preorder(BinaryTreeInorderTraversal node){
        List<Integer> resultList = new ArrayList<>();
        Stack<BinaryTreeInorderTraversal> stack = new Stack<>();
        stack.push(node);

        while(!stack.isEmpty()){
            BinaryTreeInorderTraversal current = stack.pop();
            resultList.add(current.val);
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
        return resultList;
    }

    List<Integer> postorder(BinaryTreeInorderTraversal node){
        List<Integer> resultList = new ArrayList<>();
        Stack<BinaryTreeInorderTraversal> stack = new Stack<>();
        BinaryTreeInorderTraversal current = node;
        while(current != null || !stack.isEmpty()){
             while(current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            current = current.right;
            resultList.add(current.val);
        }
        return resultList;
    }



    boolean puthSum(BinaryTreeInorderTraversal node, int targetSum){
        if (node == null){
            return false;
        } 
        Stack<BinaryTreeInorderTraversal> stack = new Stack<>();
        Stack<Integer> sumStack = new Stack<>();
        stack.push(node);
        sumStack.push(node.val);
        while(!stack.isEmpty()){
            BinaryTreeInorderTraversal current = stack.pop();
            int currentSum = sumStack.pop();
            if (current.left == null && current.right == null) {
                if(currentSum == targetSum){
                    return true; 
                } 
            }
            if (current.right != null) {
                stack.push(current.right);
                sumStack.push(currentSum + current.right.val);
            }
            if (current.left != null) {
                stack.push(current.left);
                sumStack.push(currentSum + current.left.val);
            }
        }
        return false;
    }


    public static void main(String[] args) { 
        BinaryTree sol = new BinaryTree();
        // Integer[] input = {1,2,3,4,5,null,8,null,null,6,7,9};
        Integer[] input = {5,4,8,11,null,13,4,7,2,null,null,null,1};
        BinaryTreeInorderTraversal root = sol.buildTree(input); 
        System.out.println("Tree built successfully!");
        // System.out.println(sol.inorder(root));
        // System.out.println(sol.preorder(root));

        // sol.inorder(root);
        int targetSum = 22;
        System.out.println(sol.puthSum(root, targetSum));

    }
}
