package Practice.Array;

public class MaximumSumCircularSubArray
{
    public static void main(String[] args)
    {
        int[] arr={5,-1,-1,-1,5};
        System.out.println(maxSum(arr));
    }
    public static int maxSum(int[] arr)
    {
        int sum1=arr[0];
        int maxSum=arr[0];

        int sum2=arr[0];
        int minSum=arr[0];

        int totalSum=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>sum1+arr[i])
            {
                sum1=arr[i];
            }
            else
            {
                sum1=sum1+arr[i];
            }

            maxSum=Math.max(sum1,maxSum);

            if(arr[i]<sum2+arr[i])
            {
                sum2=arr[i];
            }
            else
            {
                sum2=sum2+arr[i];
            }
            minSum=Math.min(sum2,minSum);

            totalSum=totalSum+arr[i];
        }
        if(maxSum<0)
        {
            return maxSum;
        }
        return Math.max(maxSum,totalSum-minSum);
    }
}
