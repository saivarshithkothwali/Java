package Practice.recursion.BackTracking;

import java.util.Arrays;

public class MazeAndPaths
{
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        int[][] path=new int[maze.length][maze[0].length];
        paths(maze,"",0,0,path,1);
    }
    public static void paths(boolean[][] maze,String p,int r,int c,int[][] path,int level)
    {
        if(maze[r][c]==false)
        {
            return;
        }

        if(r==2 && c==2)
        {
            path[r][c]=level;
            for(int[] el:path)
            {
                System.out.println(Arrays.toString(el));
            }
            System.out.println(p);
            return;
        }

        maze[r][c]=false;
        path[r][c]=level;
        if(r<2)
        {
            paths(maze,p+'D',r+1,c,path,level+1);
        }
        if(c<2)
        {
            paths(maze,p+'R',r,c+1,path,level+1);
        }
        if(r>0)
        {
            paths(maze,p+'U',r-1,c,path,level+1);
        }
        if(c>0)
        {
            paths(maze,p+'L',r,c-1,path,level+1);
        }

        maze[r][c]=true;
        path[r][c]=0;


    }
}
