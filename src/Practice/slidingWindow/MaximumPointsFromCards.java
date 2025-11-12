package Practice.slidingWindow;

import java.util.Scanner;

public class MaximumPointsFromCards
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,1};
        System.out.println(maxPoints(arr,3));


    }
    public static int maxPoints(int[] arr,int k)
    {
        int sum=0;
        for(int i=0;i<=k-1;i++)
        {
            sum=sum+arr[i];
        }

        int maxSum=sum;
        k=k-1;
        int last=arr.length-1;
        while(k>=0)
        {
            sum=sum-arr[k];
            k--;
            sum=sum+arr[last];
            last--;

            maxSum=Math.max(maxSum,sum);

        }
        return maxSum;
    }
}
