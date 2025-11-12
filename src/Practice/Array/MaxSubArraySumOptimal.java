package Practice.Array;

public class MaxSubArraySumOptimal
{
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(sum(arr));
    }
    public static int sum(int[] arr)
    {
        int maxSum=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<arr.length;i++)
        {


            sum=sum+arr[i];
            if(sum>maxSum)
            {
                maxSum=sum;

            }
            if(sum<0)
            {
                sum=0;
            }
        }
        return maxSum;
    }

}
