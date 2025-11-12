package Practice.Array;

public class MaximumProdSubarrayBrute
{
    public static void main(String[] args)
    {
        int[] arr={2,3,-2,4};
        System.out.println(maxProd(arr));
    }
    public static int maxProd(int[] arr)
    {

        int maxProd=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int prod=1;
            for(int j=i;j<arr.length;j++)
            {
                prod=prod*arr[j];
                maxProd=Math.max(prod,maxProd);
            }
        }
        return maxProd;
    }
}
