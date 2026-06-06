package Practice.TwoPointerSlidingWindowPrefixSum;

public class LongestSubArrayWithSumKPos
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,1,1,1,1};
        System.out.println(longest(arr,3));

    }
    public static int longest(int[] arr,int k)
    {
        int maxLen=0;

        int sum=0;
        int l=0,r=0;

        while(r<arr.length)
        {
            sum=sum+arr[r];

            while(sum>k)
            {
                sum=sum-arr[l];
                l++;
            }

            if(sum==k)
            {
                maxLen=Math.max(maxLen,r-l+1);
            }
            r++;
        }
        return maxLen;


    }
}
