package Practice.Array;

public class BestTimeBuySellStock
{
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println(best(arr));
    }
    public static int best(int[] arr)
    {
        int buy=arr[0];
        int maxProfit=0;

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<buy)
            {
                buy=arr[i];
            }
            else//arr[i]>=buy
            {
                int profit=arr[i]-buy;
                maxProfit=Math.max(profit,maxProfit);
            }
        }

        return maxProfit;
    }
}
