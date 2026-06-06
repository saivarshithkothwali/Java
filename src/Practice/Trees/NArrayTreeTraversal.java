package Practice.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NArrayTreeTraversal
{
    public static void main(String[] args)
    {

    }
    class Node<T>
    {
        T data;
        ArrayList<Node<T>> children=new ArrayList<>();

        Node(T data)
        {
            this.data=data;

        }
    }

    public<T> ArrayList<T> bfs(Node<T> root)
    {
        Queue<Node<T>> queue=new LinkedList<>();
        ArrayList<T> ans=new ArrayList<>();

        queue.offer(root);
        while(!queue.isEmpty())
        {
            Node<T> temp=queue.poll();
            ans.add(temp.data);

            for(Node<T> el:temp.children)
            {
                queue.offer(el);
            }
        }
        return ans;

    }
}
