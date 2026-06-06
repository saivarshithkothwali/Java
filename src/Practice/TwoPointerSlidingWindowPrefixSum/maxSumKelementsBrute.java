package Practice.TwoPointerSlidingWindowPrefixSum;

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

        for(int i=0;i<=arr.length-k;i++)
        {
            sum=0;
            for(int j=i;j<=k+i-1;j++)
            {
                sum=sum+arr[j];

            }
            maxSum=Math.max(sum,maxSum);
        }
        return maxSum;
    }
}
