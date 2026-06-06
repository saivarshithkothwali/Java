package Practice.BinarySearch2D;

import java.util.Arrays;

public class peakElementIIBrute
{
    public static void main(String[] args)
    {
        //int[][] matrix={{4,2,5,1,4,5},{2,9,3,2,3,2},{1,7,6,0,1,3},{3,6,2,3,7,3}};
        int[][] matrix={{10,20,15},{21,30,14},{7,16,32}};
        System.out.println(Arrays.toString(find(matrix)));
    }
    public static int[] find(int[][] matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                int left=(j>0)?matrix[i][j-1]:-1;
                int right=(j<matrix[i].length-1)?matrix[i][j+1]:-1;
                int top=(i>0)?matrix[i-1][j]:-1;
                int bottom=(i<matrix.length-1)?matrix[i+1][j]:-1;

                if(matrix[i][j]>left && matrix[i][j]>top && matrix[i][j]>right && matrix[i][j]>bottom)
                {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
