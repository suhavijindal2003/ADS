import java.util.*;
class  TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){
        this.val=val;
    }
}
public class LevelOrderTree {
    public static List<List<Integer>> levelorder(TreeNode root){
        List<List<Integer>> res=new ArrayList<>();
        if(root== null) return res;
        Queue<TreeNode>queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelsize=queue.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<levelsize;i++){
                TreeNode node=queue.poll();
                level.add(node.val);
                if(node.left!=null)queue.add(node.left);
                if(node.right!=null)queue.add(node.right);
            }
            res.add(level);
        }
        return res;
    }

   public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode( 20);
        root.right.left = new TreeNode( 15);
        root.right.right = new TreeNode(7);
        System.out.println(levelorder(root));
    } 
    
}
