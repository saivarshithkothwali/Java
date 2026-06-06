package Practice.BinarySearch2D;

import java.util.Scanner;

public class searchIn2DOptimal
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] matrix=new int[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=sc.nextInt();
//                3 3
//                1 2 3
//                4 5 6
//                7 8 9
            }
        }

        int target=sc.nextInt();

        System.out.println(find(matrix,target));


    }

    public static boolean find(int[][] matrix,int target)
    {
        for(int i=0;i<matrix.length;i++)
        {

                if(matrix[i][0]<=target && target<=matrix[i][matrix[i].length-1])
                {
                    return BS(matrix[i],target);

                }

        }
        return false;

    }

    public static boolean BS(int[] matrix,int target)
    {
        int s=0;
        int e=matrix.length-1;

        while(s<=e)
        {
            int mid = s + (e - s) / 2;

            if (matrix[mid] == target)
            {
                return true;
            } else if (target < matrix[mid])
            {
                e = mid - 1;
            } else
            {
                s = mid + 1;
            }
        }
        return false;

    }


}
