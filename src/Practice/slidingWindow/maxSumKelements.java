package Practice.slidingWindow;


public class maxSumKelements
{
    public static void main(String[] args)
    {
        int[] arr={-1,2,3,3,4,5,-1};

        System.out.println(max(arr,4));

    }
    public static int max(int[] arr,int k)
    {
        int maxSum=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum=sum+arr[j];
                if((j-i+1)==k)
                {
                    maxSum=Math.max(maxSum,sum);
                }
            }
        }
        return maxSum;
    }
}
