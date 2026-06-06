package Practice.TwoPointerSlidingWindowPrefixSum;

public class LongestSubArrayWithSumKBrute
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,1,1,1,1};
        System.out.println(longest(arr,3));

    }
    public static int longest(int[] arr,int k)
    {

        int maxLen=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum=sum+arr[j];

                if(sum==k)
                {
                    maxLen=Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }
}
