import java.util.Stack;

class  TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){
        this.val=val;
    }
}
public class leetcode230 {
    //Find the kth samllest in banary tree

    //Apporach :use inorder ,to get ellement in sorting and then stop when we reach the kth element

 public static int kthsamllestt(TreeNode root, int k){
    Stack<TreeNode> stack = new Stack<>();
    while (true) {
        while (root != null) {
            stack.push(root);
            root = root.left;
        }

        root = stack.pop();
        if (--k == 0) return root.val;
        root = root.right;
    }
}

public static void main(String[] args) {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(1);
    root.left.right = new TreeNode(2);
    root.right = new TreeNode(4);

    System.out.println(kthsamllestt(root, 1));
    System.out.println(kthsamllestt(root, 2));
}
 
}
