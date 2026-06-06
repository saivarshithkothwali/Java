package Practice.BinarySearch2D;

public class searchIn2DBrute
{
    public static void main(String[] args)
    {
        int[][] matrix={{3,4,7,9},{12,13,16,18},{20,21,23,29}};
        int target=23;
        System.out.println(find(matrix,target));
    }

    public static boolean find(int[][] matrix,int target)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
