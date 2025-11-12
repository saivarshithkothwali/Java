package Practice.slidingWindow;


public class maxSumKelementsOptimal1
{
    public static void main(String[] args)
    {
        int[] arr={-1,2,3,3,4,5,-1};

        System.out.println(max(arr,4));

    }
    public static int max(int[] arr,int k)
    {
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum=sum+arr[i];
        }

        int maxSum=sum;
        int l=0;
        int r=k-1;

        while(r<=arr.length-2)
        {
            sum=sum-arr[l];
            l++;
            r++;
            sum=sum+arr[r];

            maxSum=Math.max(sum,maxSum);
        }
        return maxSum;
    }
}
