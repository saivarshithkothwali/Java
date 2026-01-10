package Practice.recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class MazeaAllPathsBT1
{
    public static void main(String[] args)
    {
        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        System.out.println(paths(maze,"",0,0));
    }
    public static List<String> paths(boolean[][] maze, String p, int r, int c)
    {
        if(maze[r][c]==false)
        {
            ArrayList<String> list=new ArrayList<>();
            return list;
        }
        if(r==2 && c==2)
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        maze[r][c]=false;

        ArrayList<String> ans=new ArrayList<>();

        if(r<2)
        {
            ans.addAll(paths(maze,p+'D',r+1,c));
        }
        if(c<2)
        {
            ans.addAll(paths(maze,p+'R',r,c+1));
        }
        if(r>0)
        {
            ans.addAll(paths(maze,p+'U',r-1,c));
        }
        if(c>0)
        {
            ans.addAll(paths(maze,p+'L',r,c-1));
        }

        maze[r][c]=true;

        return ans;
    }
}
