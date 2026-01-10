package Practice.recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class MazeWithObstacles
{
    public static void main(String[] args)
    {
        boolean[][] maze={{true,true,true},{true,false,true},{true,true,true}};
        System.out.println(paths(maze,"",0,0));
    }
    public static List<String> paths(boolean[][] maze, String p, int r, int c)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        if(maze[r][c]==false)
        {
            ArrayList<String> list=new ArrayList<>();
            //list.add(p);
            return list;
        }

        ArrayList<String> ans=new ArrayList<>();

        if(r<maze.length-1)
        {
            ans.addAll(paths(maze,p+'D',r+1,c));
        }
        if(c<maze[0].length-1)
        {
            ans.addAll(paths(maze,p+'R',r,c+1));
        }

        return ans;
    }
}
