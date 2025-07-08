package Practice.slidingWindow;

public class longestSubarraywithSumLessThanorqtoKOptimal
{
    public static void main(String[] args) {
        int[] arr={2,5,1,7,10};
        System.out.println(longest(arr,15));
    }
    public static int longest(int[] arr,int k)
    {
        int sum=0,maxLen=0,l=0,r=0;

        while(r<arr.length)
        {
            sum=sum+arr[r];
            if(sum>k)
            {
                sum=sum-arr[l];
                l++;

            }
            if(sum<=k)
            {
                maxLen=Math.max(maxLen,r-l+1);
            }
            r++;
        }
        return maxLen;
    }
}
