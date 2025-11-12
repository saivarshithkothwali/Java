package Practice.Array;

import java.util.Arrays;

public class TwoSumBF
{
    public static void main(String[] args)
    {
        int[] arr={2,6,5,8,11};
        int target=14;
        System.out.println(Arrays.toString(sum(arr,target)));


    }
    public static int[] sum(int[] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
