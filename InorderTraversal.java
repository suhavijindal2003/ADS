class  TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){
        this.val=val;
    }
}
public class InorderTraversal {
    //Apporach : recursion (DFS) to transverse to the leftsubtree

    // public static List<Integer>InorderTrav(TreeNode root){
    //     List <Integer>res=new ArrayList<>();
    //     Stack <TreeNode>stack=new Stack<>();
    //     TreeNode curr=root;
    //     while(curr!=null || !stack.isEmpty()){
    //         while(curr!=null){
    //             stack.push(curr);
    //             curr=curr.left;
    //         }
    //         curr=stack.pop();
    //         res.add(curr.val);
    //         curr=curr.right;
    //     }
    //     return res;
    // }

    public static void InorderTrav(TreeNode root){
        if(root==null)return;
        InorderTrav(root.left);
        System.out.println(root.val+" ");
        InorderTrav(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode( 20);
        root.right.left = new TreeNode( 15);
        root.right.right = new TreeNode(7);
        // System.out.println(InorderTrav(root));
        InorderTrav(root);
    } 
    
}
