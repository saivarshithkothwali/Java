package Practice.BinarySearch2D;

import java.util.Arrays;

public class rowWithMaxOnesOptimal
{
    public static void main(String[] args) {
        int[][] matrix={{0,0,0,1},{0,1,1,1},{0,0,1,1}};
        System.out.println(Arrays.toString(find(matrix)));
    }

    public static int[] find(int[][] matrix)
    {
        int startPoint=-1;
        int len=0;
        int maxLen=0;
        int row=-1;

        for(int i=0;i<matrix.length;i++)
        {
            int s=0;
            int e=matrix[i].length-1;

            while(s<=e)
            {
                int mid=s+(e-s)/2;

                if(matrix[i][mid]==1)
                {

                    startPoint=mid;
                    e=mid-1;
                }
                else
                {
                    s=mid+1;
                }

            }
            len=matrix[i].length-startPoint;
            if(len>maxLen)
            {
                maxLen=len;
                row=i;
            }


        }
        return new int[] {maxLen,row};
    }
}
