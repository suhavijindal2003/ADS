import java.util.*;
class  TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){
        this.val=val;
    }
}
public class DiameterofBinary {
    //the diameter of the binary tree is the lengyth of the longest path between two node 
    //APPORACh: recursion to find the heigjt of thre left and right subtree
    //update the maximun diameter encountered

    static  int diameter=0;
    public static int dobt(TreeNode root){
        height(root);
        return diameter;
    }
    public static int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int leftheight=height(node.left);
        int rightheight=height(node.right);
        diameter=Math.max(diameter,leftheight+rightheight);
        return 1+Math.max(leftheight, rightheight);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode( 20);
        root.right.left = new TreeNode( 15);
        root.right.right = new TreeNode(7);
        System.out.println(dobt(root));
    } 
}
