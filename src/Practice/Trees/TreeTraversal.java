package Practice.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal
{
    public static void main(String[] args) {

    }

    class TreeNode<T>
    {
        T val;
        TreeNode<T> right;
        TreeNode<T> left;


        TreeNode(T val)
        {
            this.val=val;
            this.left=null;
            this.right=null;
        }

    }

    public<T> void bfs(TreeNode<T> root)
    {
        Queue<TreeNode<T>> queue=new LinkedList<>();

        ArrayList<T> list=new ArrayList<>();
        queue.offer(root);

        while(!queue.isEmpty())
        {
            TreeNode<T> node=queue.peek();
            list.add(node.val);
            queue.poll();

            if(node.left!=null)
            {
                queue.offer(node.left);
            }
            if(node.right!=null)
            {
                queue.offer(node.right);
            }
        }
    }




}
