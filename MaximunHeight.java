class  TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){
        this.val=val;
    }
}
public class MaximunHeight {
    //Find the maximun  depth of the binary tree
    public static int height(TreeNode node){
        if(node==null){
            return 0;
        }
        return 1+Math.max(height(node.left),height(node.right));
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode( 20);
        root.right.left = new TreeNode( 15);
        root.right.right = new TreeNode(7);
        System.out.println(height(root));
    } 
}
