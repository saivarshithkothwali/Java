package Practice.recursion.BackTracking;

public class MazeAllPathsCount
{
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        System.out.println(paths(maze,0,0));
    }

    public static int paths(boolean[][] maze,int r,int c)
    {
        int count=0;
        if(maze[r][c]==false)
        {
            return 0;
        }
        if(r==2 && c==2)
        {
            return 1;
        }

        maze[r][c]=false;


        if(r<2)
        {
            count= count+paths(maze,r+1,c);
        }
        if(c<2)
        {
            count= count+paths(maze,r,c+1);
        }
        if(r>0)
        {
            count= count+paths(maze,r-1,c);
        }
        if(c>0)
        {
            count= count+paths(maze,r,c-1);
        }

        maze[r][c]=true;

        return count;
    }
}
