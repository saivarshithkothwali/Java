package Practice.BinarySearch2D;

import java.util.Arrays;

public class searchIn2DIIOptimal
{
    public static void main(String[] args) {
        int[][] matrix={{1,4,7,11,15},{2,5,8,12,19},{10,13,14,17,24},{18,21,23,26,30}};
        int target=14;
        System.out.println(Arrays.toString(find(matrix,target)));
    }
    public static int[] find(int[][] matrix,int target)
    {
        int r=0,c=matrix[0].length-1;

        while(r<matrix.length && c>=0)
        {
            if(matrix[r][c]==target)
            {
                return new int[]{r,c};
            }
            else if(matrix[r][c]>target)
            {
                c--;
            }
            else//matrix[r][c]<target
            {
                r++;
            }
        }
        return new int[]{-1,-1};
    }

}
