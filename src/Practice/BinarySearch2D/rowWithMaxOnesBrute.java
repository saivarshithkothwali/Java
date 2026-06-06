package Practice.BinarySearch2D;

import java.util.Arrays;

public class rowWithMaxOnesBrute
{
    public static void main(String[] args) {
        int[][] matrix={{0,1,1,1},{0,1,1,1},{0,0,1,1}};
        System.out.println(Arrays.toString(find(matrix)));
    }
    public static int[] find(int[][] matrix)
    {
        int count,maxCount=0;
        int row=-1;

        for(int i=0;i<matrix.length;i++)
        {
            count=0;
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==1)
                {
                    count++;
                }
            }
            if(count>maxCount)
            {
                maxCount=count;
                row=i;
            }
        }
        //System.out.println("maxCount="+maxCount+" row="+row);

        return new int[]{row,maxCount};
    }
}


