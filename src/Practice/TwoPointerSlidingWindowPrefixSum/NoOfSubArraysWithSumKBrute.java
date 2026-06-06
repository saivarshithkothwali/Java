package Practice.TwoPointerSlidingWindowPrefixSum;

public class NoOfSubArraysWithSumKBrute
{
    public static void main(String[] args) {
        int[] arr={1,2,3,-3,1,1,1,4,2,-3};
        System.out.println(total(arr,3));

    }
    public static int total(int[] arr,int k)
    {
        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum=sum+arr[j];
                if(sum==k)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
