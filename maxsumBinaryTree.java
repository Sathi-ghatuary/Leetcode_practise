import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class maxsumBinaryTree {
    public int maxLevelSum(TreeNode root) {
        if(root==null) return 0;

        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        int level=1;
        int maxlevel=1;
        int maxsum=Integer.MIN_VALUE;
        while(!queue.isEmpty()){
            int size=queue.size();
            int levelSum=0;
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                levelSum +=node.val;
                if(node.left!=null)
                  queue.offer(node.left);

            
            if(node.right!=null)
                  queue.offer(node.right);
                  
            }
            if(levelSum>maxsum){
                maxsum=levelSum;
                maxlevel=level;
            }level++;

        }
        return maxlevel;
    }
}
