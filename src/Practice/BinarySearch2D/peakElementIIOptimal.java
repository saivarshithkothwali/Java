package Practice.BinarySearch2D;

import java.util.Arrays;

public class peakElementIIOptimal
{
    public static void main(String[] args)
    {
        int[][] matrix={{10,20,15},{21,30,14},{7,16,32}};
        System.out.println(Arrays.toString(find(matrix)));
    }
    public static int[] find(int[][] matrix)
    {
        int s=0;
        int e=matrix[0].length-1;

        while(s<=e)
        {
            int mid=s+(e-s)/2;
            int maxEl=-1;
            int row=-1;
            for(int i=0;i<matrix.length;i++)
            {
                if(matrix[i][mid]>maxEl)
                {
                    maxEl=matrix[i][mid];
                    row=i;
                }
            }

            int left=(mid>0)?matrix[row][mid-1]:-1;
            int right=(mid<matrix[row].length-1)?matrix[row][mid+1]:-1;

            if(maxEl>left && maxEl>right)
            {
                return new int[] {row,mid};
            }

            else if(maxEl<left)
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        return new int[] {-1,-1};
    }
}
