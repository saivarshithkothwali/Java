package Practice.TwoPointerSlidingWindowPrefixSum;


public class maxSumKelementsOptimal1
{
    public static void main(String[] args)
    {
        int[] arr={-1,2,3,3,4,5,-1};

        System.out.println(max(arr,4));

    }
    public static int max(int[] arr,int k)
    {
        int l=0,r=0;
        int sum=0;
        int maxSum=Integer.MIN_VALUE;

        while(r<arr.length)
        {
            sum=sum+arr[r];

            if(r-l+1==k)
            {
                maxSum=Math.max(sum,maxSum);
                sum=sum-arr[l];
                l++;
            }
            r++;
        }
        return maxSum;
    }
}
