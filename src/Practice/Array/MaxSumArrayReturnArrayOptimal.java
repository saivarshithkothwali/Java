package Practice.Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MaxSumArrayReturnArrayOptimal
{
    public static void main(String[] args)
    {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(sum(arr));
    }
    public static ArrayList<Integer> sum(int[] arr)
    {
        int sum=arr[0];
        int maxSum=arr[0];

        int start=0;
        int ansStart=0;
        int ansEnd=0;

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>sum+arr[i])
            {
                start=i;

                sum=arr[i];
            }
            else
            {
                sum=sum+arr[i];
            }
            if(sum>maxSum)
            {
                maxSum=sum;
                ansStart=start;
                ansEnd=i;
            }
        }
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=ansStart;i<=ansEnd;i++)
        {
            list.add(arr[i]);
        }
        return list;


    }
}
