package Practice.TwoPointerSlidingWindowPrefixSum;

import java.util.Arrays;

public class maxPointsBetter
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,1};
        System.out.println(max(arr,3));
    }
    public static int max(int[] arr,int k)
    {
        if(k == arr.length)
        {
            int total = 0;

            for(int el : arr)
            {
                total += el;
            }

            return total;
        }
        int[] prefixSum=new int[arr.length];
        int sum=0;
        for(int i=0;i<prefixSum.length;i++)
        {
            sum=sum+arr[i];
            prefixSum[i]=sum;
        }

        int l=0;
        int r=arr.length-k-1;
        int total=prefixSum[prefixSum.length-1];
        int ignoedSum;
        int maxScore=0;

        while(r<prefixSum.length)
        {
            if(l==0)
            {
                ignoedSum=prefixSum[r];
            }
            else
            {
                ignoedSum=prefixSum[r]-prefixSum[l-1];
            }
            int score=total-ignoedSum;
            maxScore=Math.max(score,maxScore);
            l++;
            r++;
        }
        return maxScore;
    }
}
