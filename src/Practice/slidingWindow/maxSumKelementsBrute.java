package Practice.slidingWindow;

import java.util.Arrays;

public class maxSumKelementsBrute
{
    public static void main(String[] args)
    {
        int[] arr={-1,2,3,3,4,5,-1};
        System.out.println(maxSum(arr,4));

    }
    static int maxSum(int[] arr,int k)
    {
        int sum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum=sum+arr[j];

                if(j-i+1==k)
                {

                    maxSum=Math.max(sum,maxSum);
                    break;
                }


            }
        }
        return maxSum;
    }
}
