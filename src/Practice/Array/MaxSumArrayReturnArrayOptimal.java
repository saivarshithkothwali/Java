package Practice.Array;

public class MaxSumArrayReturnArrayOptimal
{
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        sum(arr);
    }
    public static void sum(int[] arr)
    {
        int sum=0;
        int start=0;
        int sIndex=-1;
        int eIndex=-1;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(sum==0)
                start=i;
            sum=sum+arr[i];
            if(sum>maxSum)
            {
                maxSum=sum;
                sIndex=start;
                eIndex=i;
            }
            if(sum<0)
                sum=0;
        }
        System.out.println("maxSum=" +maxSum);

        for(int i=sIndex;i<=eIndex;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
