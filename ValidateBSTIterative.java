

import java.util.Stack;

public class ValidateBSTIterative {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        Integer prev = null;

        while (!stack.isEmpty() || current != null) {
            while (current != null) {
                stack.push(current);
                current = current.left; // Move to leftmost node
            }

            current = stack.pop(); // Visit the node
            
            if (prev != null && current.val <= prev) {
                return false; // Inorder values must be in strictly increasing order
            }
            
            prev = current.val;
            current = current.right; // Move to right subtree
        }

        return true;
    }

    public static void main(String[] args) {
        ValidateBSTIterative bst = new ValidateBSTIterative();
        
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        
        System.out.println(bst.isValidBST(root)); // Output: true
    }
}
