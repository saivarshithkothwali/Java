package Practice.slidingWindow;

public class longestSubarraywithSumLessThanorqtoKBetter
{
    public static void main(String[] args) {
        int[] arr={2,5,1,7,10};
        System.out.println(longest(arr,14));
    }
    public static int longest(int[] arr,int k)
    {
        int sum=0;
        int maxLen=0;
        int l=0,r=0;
        while(r<arr.length)
        {
            sum=sum+arr[r];
            while(sum>k)
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
