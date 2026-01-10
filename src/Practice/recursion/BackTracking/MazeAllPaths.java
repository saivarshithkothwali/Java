package Practice.recursion.BackTracking;

public class MazeAllPaths
{
    public static void main(String[] args) {
        boolean[][] maze={{true,true,true},{true,true,true},{true,true,true}};
        paths(maze,"",0,0);
    }
    public static void paths(boolean[][] maze,String p,int r,int c)
    {
        if(r==2 && c==2)
        {
            System.out.println(p);
            return;
        }

        if(r<2)
        {
            paths(maze,p+'D',r+1,c);
        }
        if(c<2)
        {
            paths(maze,p+'R',r,c+1);
        }
        if(r>0)
        {
            paths(maze,p+'U',r-1,c);
        }
        if(c>0)
        {
            paths(maze,p+'L',r,c-1);
        }

    }
}
