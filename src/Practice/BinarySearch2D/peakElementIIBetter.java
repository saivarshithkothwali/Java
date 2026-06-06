package Practice.BinarySearch2D;

import java.util.Arrays;

public class peakElementIIBetter
{
    public static void main(String[] args)
    {
        int[][] matrix={{10,20,15},{21,30,14},{7,16,32}};
        System.out.println(Arrays.toString(find(matrix)));

    }
    public static int[] find(int[][] matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            int largestEl=Integer.MIN_VALUE;
            int maxCol=-1;
            for(int j=0;j<matrix[i].length;j++)
            {

                if(matrix[i][j]>largestEl)
                {
                    largestEl=matrix[i][j];
                    maxCol=j;
                }
            }
            int top=(i>0)?matrix[i-1][maxCol]:-1;
            int bottom=(i<matrix.length-1)?matrix[i+1][maxCol]:-1;

            if(largestEl>top && largestEl>bottom)
            {
                return new int[] {i,maxCol};
            }


        }
        return new int[] {-1,-1};
    }
}
