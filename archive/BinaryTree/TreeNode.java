
import java.util.*;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


class Solution {

    public TreeNode  buildTree(Integer[] arr){
        if(arr[0] == null || arr.length==0){
            return null;
        }

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while(!q.isEmpty() && i<arr.length){
            TreeNode current = q.poll();

            if(arr[i] != null){
                current.left = new TreeNode(arr[i]);
                q.add(current.left);
            }
            i++;
            if(i<arr.length && arr[i]!=null){
                current.right = new TreeNode(arr[i]);
                q.add(current.right);
            }
            i++;
        }
        return root;
    }

    public boolean isMirror(TreeNode a, TreeNode b){
        if(a==null && b==null){
            return true;
        }
        if(a==null || b==null){
            return false;
        }
        if(a.val != b.val){
            return false;
        }
        return isMirror(a.left, b.right) && isMirror(a.right, b.left);
    }

    public TreeNode invertTree(TreeNode root){
        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }

    public void printTree(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            System.out.print(curr.val + " ");

            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
    }

    
    
    public int shortestPath(TreeNode root){
        if (root == null){
            return 0;
        } 
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> pathStack = new Stack<>();
        stack.push(root);
        pathStack.push(1);
        int res = Integer.MAX_VALUE;
        while(!stack.isEmpty()){
            TreeNode current = stack.pop();
            int currentpath = pathStack.pop();
            if (current.left == null && current.right == null) {
                res = Math.min(res, currentpath);
            }
            if (current.right != null) {
                stack.push(current.right);
                pathStack.push(currentpath + 1);
            }
            if (current.left != null) {
                stack.push(current.left);
                pathStack.push(currentpath + 1);
            }
        }
        return res;
    }
    
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null){
            return p==q;
        }

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(p);
        stack2.push(q);
        while(!stack1.isEmpty() && !stack2.isEmpty()){
            TreeNode current1 = stack1.pop();
            TreeNode current2 = stack2.pop();
            if(current1==null && current2==null){
                continue;
            }
            if((current1==null) != (current2==null)){
                continue;
            }
            if (current1.val != current2.val) {
                return false;
            }
            if ((current1.left == null) != (current2.left == null)){
                return false;
            }
            if ((current1.right == null) != (current2.right == null)){
                return false;
            }
            if (current1.right != null && current2.right != null) {
                stack1.push(current1.right);
                stack2.push(current2.right);
            }else{
                return false;
            }
            if (current1.left != null && current2.left != null) {
                stack1.push(current1.left);
                stack2.push(current2.left);
            }else{
                return false;
            }
        }




        return true;
    }
    
    
    public int maximumPath(TreeNode root){
        if (root == null){
            return 0;
        } 
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> pathStack = new Stack<>();
        stack.push(root);
        pathStack.push(1);
        int res = Integer.MIN_VALUE;
        while(!stack.isEmpty()){
            TreeNode current = stack.pop();
            int currentpath = pathStack.pop();
            if (current.left == null && current.right == null) {
                res = Math.max(res, currentpath);
                System.out.println(res);
            }
            if (current.right != null) {
                stack.push(current.right);
                pathStack.push(currentpath + 1);
            }
            if (current.left != null) {
                stack.push(current.left);
                pathStack.push(currentpath + 1);
            }
        }
        return res;
    }
    
    
    public int SumOfLeftLeaves(TreeNode root){
        if (root == null){
            return 0;
        } 
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int sumOfLeaf = 0;
        while(!stack.isEmpty()){
            TreeNode current = stack.pop();
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                if(current.left.left == null && current.left.right == null){
                    sumOfLeaf += current.left.val;
                    System.out.println(sumOfLeaf);
                }
                stack.push(current.left);
            }
        }
        return sumOfLeaf;
    }
    
    public List<String> binaryTreePaths(TreeNode root){
        List<String> resultPath = new ArrayList<>();
        if (root == null){
            return resultPath;
        } 
        Stack<TreeNode> stack = new Stack<>();
        Stack<String> pathStack = new Stack<>();
        stack.push(root);
        pathStack.add(String.valueOf(root.val));
        while(!stack.isEmpty()){
            TreeNode current = stack.pop();
            String path = pathStack.pop();
            if (current.left == null && current.right == null) {
                resultPath.add(path);
                System.out.println(path);
            }
            if (current.right != null) {
                stack.push(current.right);
                pathStack.add(path+"->"+current.right.val);
            }
            if (current.left != null) {
                stack.push(current.left);
                pathStack.add(path+"->"+current.left.val);
            }
        }
        return resultPath;
    }


    public TreeNode searchInABinarySearchTree(TreeNode root, int val){
        if(root == null){
            return null;
        }
        if(root.val == val){
            return root;
        }
        if(root.val > val){
            return searchInABinarySearchTree(root.left, val);
        }
        if(root.val < val){
            return searchInABinarySearchTree(root.right, val);
        }
        return null;
    }


    public List<List<Integer>> puthSum(TreeNode root, int targetSum){
        List<List<Integer>> resultList = new ArrayList<>();
        if (root == null){
            return resultList;
        } 
        Stack<TreeNode> stack = new Stack<>();
        Stack<List<Integer>> pathStack = new Stack<>();
        stack.push(root);
        pathStack.push(new ArrayList<>(Arrays.asList(root.val)));

        while(!stack.isEmpty()){
            TreeNode current = stack.pop();
            List<Integer> path = pathStack.pop();
            if (current.left == null && current.right == null) {
                int sum = 0;
                for(int num: path){
                    sum += num;
                }
                if(sum == targetSum){
                    resultList.add(path); 
                } 
            }
            if (current.right != null) {
                List<Integer> newPath = new ArrayList<>(path);
                newPath.add(current.right.val);
                stack.push(current.right);
                pathStack.push(newPath);
            }
            if (current.left != null) {
                List<Integer> newPath = new ArrayList<>(path);
                newPath.add(current.left.val);
                stack.push(current.left);
                pathStack.push(newPath);
            }
        }
        System.out.println(resultList);
        return resultList;
    }

    public boolean twoSumBST(TreeNode root, int k, HashSet<Integer> set){
        if(root == null){
            return false;
        }        
        if(set.contains(k-root.val)){
            System.out.println(true);
            return true;
        }
        set.add(root.val);
        return twoSumBST(root.left, k, set) || twoSumBST(root.right, k, set);
    }

    public void isSymmetric(TreeNode root) {
        Solution sol = new Solution();
        //System.out.println(sol.isMirror(root.left, root.right));
        // TreeNode invert = sol.invertTree(root);
        // sol.printTree(invert);
        // sol.printTree(root);
        // System.out.println(sol.shortestPath(root));
        //System.out.println(sol.isSameTree(p, q));
        //System.out.println(sol.maximumPath(root));
        // System.out.println(sol.SumOfLeftLeaves(root));
        //obj.SumOfLeftLeaves(root);
        // obj.binaryTreePaths(root);
        // System.out.println(sol.binaryTreePaths(root));
        // TreeNode node = sol.searchInABinarySearchTree(root, 2);
        // sol.printTree(node);
        // sol.puthSum(root, 22);
        HashSet<Integer> set = new HashSet<>();
        sol.twoSumBST(root, 9,set);
    }

    public static void main(String[] args) {
        // Integer[] input1 = {1,2};
        // Integer[] input2 = {1,null,2};
        // Solution obj = new Solution();
        // TreeNode root1 = obj.buildTree(input1);
        // TreeNode root2 = obj.buildTree(input2);
        // obj.isSymmetric(root1,root2);  
        
        
        
        Integer[] input = {5,3,6,2,4,null,7};
        Solution obj = new Solution();
        TreeNode root = obj.buildTree(input);
        obj.isSymmetric(root);  
        
        
    }
}