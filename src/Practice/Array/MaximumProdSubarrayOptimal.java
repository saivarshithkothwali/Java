package Practice.Array;

public class MaximumProdSubarrayOptimal
{
    public static void main(String[] args) {
        int[] arr={2,3,-2,4};
        System.out.println(maxProd(arr));
    }
    public static int maxProd(int[] arr)
    {
        int prefix=1;
        int suffix=1;
        int maxProd=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(prefix==0)
                prefix=1;
            if(suffix==0)
                suffix=1;

            prefix=prefix*arr[i];
            suffix=suffix*arr[arr.length-i-1];

            maxProd=Math.max(maxProd,Math.max(prefix,suffix));
        }


        return maxProd;

    }
}
