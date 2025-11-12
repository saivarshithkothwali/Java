package Practice.slidingWindow;

public class maxSumKelementsOptimal
{
    public static void main(String[] args)
    {
        int[] arr={-1,2,3,3,4,5,-1};
        System.out.println(maxSum(arr,4));
    }

    public static int maxSum(int[] arr,int k)
    {
        int l=0;
        int r=0;int sum=0;
        int maxSum=Integer.MIN_VALUE;
        while(r<arr.length)
        {

            sum=sum+arr[r];


            if(r-l+1==k)
            {
                maxSum=Math.max(maxSum,sum);
                sum=sum-arr[l];
                l++;

            }

            r++;
        }
        return maxSum;
    }

}
