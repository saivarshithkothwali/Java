package Practice.Array;

public class maximumProductSubarrayOptimal
{
    public static void main(String[] args)
    {
        int[] arr={-2,-3,0,-4};
        System.out.println(max(arr));
    }
    public static int max(int[] arr)
    {
        int ans=arr[0];
        int maxProd=arr[0];
        int minProd=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            int prevMax=maxProd;
            int prevMin=minProd;

            maxProd=Math.max(arr[i],Math.max(arr[i]*prevMax,arr[i]*prevMin));
            minProd=Math.min(arr[i],Math.min(arr[i]*prevMax,arr[i]*prevMin));

            ans=Math.max(ans,maxProd);
        }
        return ans;
    }
}
